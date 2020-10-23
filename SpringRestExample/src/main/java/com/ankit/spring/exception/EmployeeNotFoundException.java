package com.ankit.spring.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee not found")
public class EmployeeNotFoundException extends Exception{
	
	private static final long serialVersionUID = 2211456188790455388L;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeNotFoundException.class);

	public EmployeeNotFoundException(int id) {
		
		super("EmployeeNotFoundException with id : "+id);
		LOGGER.error("EmployeeNotFoundException id : "+id);
	}

}
