package com.ankit.spring.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ankit.spring.constant.EmpRestURIConstants;
import com.ankit.spring.exception.EmployeeNotFoundException;
import com.ankit.spring.model.Employee;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	static Map<Integer,Employee> empData = new HashMap<>();
	List<Employee> empList;
	
	@GetMapping(EmpRestURIConstants.DUMMY_EMP)
	//@RequestMapping(value = EmpRestURIConstants.DUMMY_EMP, method = RequestMethod.GET)
	public Employee getDummyEmployee(){
		
		LOGGER.info("Start getDummyEmployee");
		Employee employee = new Employee(3,"Ankit4",new Date());
		empData.put(1, employee);
		
		return employee;
	}
	
	
	@GetMapping(EmpRestURIConstants.GET_EMP)
	//@RequestMapping(value = EmpRestURIConstants.GET_EMP, method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int empId){
		
		LOGGER.info("Start getEmployee");
		populateData();
		
		return empData.get(empId);
	}
	
	private void populateData() {
	
		empData.put(1, new Employee(1, "Ankit", new Date()));
		empData.put(2, new Employee(3, "Baghel", new Date()));
	}

	
	@GetMapping(EmpRestURIConstants.GET_ALL_EMP)
	//@RequestMapping(value = EmpRestURIConstants.GET_ALL_EMP, method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		
		LOGGER.info("Start getAllEmployees");
		populateData();
		empList = new ArrayList<>();
		empList.addAll(empData.values());
		
		return empList;
	}
	
	
	//@RequestMapping(value = EmpRestURIConstants.CREATE_EMP, method = RequestMethod.POST)
	@PostMapping(EmpRestURIConstants.CREATE_EMP)
	public Employee createEmployee(@RequestBody Employee emp){
		
		LOGGER.info("Start createEmployee");
		Employee employee = new Employee(emp.getId(),emp.getName(),emp.getCreatedDate());
		
		return employee;
	}

	
	@DeleteMapping(EmpRestURIConstants.DELETE_EMP)
	//@RequestMapping(value = EmpRestURIConstants.DELETE_EMP, method = RequestMethod.DELETE)
	public Employee deleteEmployee(@PathVariable("id") int empId){
		
		LOGGER.info("Start deleteEmployee");
		populateData();
		Employee emp = empData.get(empId);
		empData.remove(empId);
		return emp;
	}
	
	
	@PutMapping(EmpRestURIConstants.UPDATE_EMP)
	//@RequestMapping(value = EmpRestURIConstants.UPDATE_EMP, method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable("id") int empId) throws Exception{
		
		LOGGER.info("Start updateEmployee");
		populateData();
		Employee updatedEmp = empData.get(empId);
		
		if(updatedEmp!=null){
			updatedEmp.setName(emp.getName());
			empData.put(emp.getId(),updatedEmp);
			return updatedEmp;
		}else if(empId==5)
			throw new EmployeeNotFoundException(empId);
		else if(empId==6)
			throw new SQLException("SQLException, id="+empId);
		else if(empId==7)
			throw new IOException("IOException, id="+empId);
		else if(empId==8)
			throw new NullPointerException();
		else
			throw new Exception();
	}
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request,Exception ex){
		
		LOGGER.error("Requested url="+request.getRequestURL());
		LOGGER.error("Exception raised="+ex);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.addObject("url",request.getRequestURL());
		
		mav.setViewName("error");
		
		return mav;
	}
	
}
