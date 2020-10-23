package org.maven.FirstHib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


@SuppressWarnings("deprecation")
public class EmployeeService {
	
	public static void main(String[] args) {
		
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//Employee 1 
		Employee emp1=new Employee();  
	    emp1.setEmpId("654924");  
	    emp1.setFirstName("ankit");  
	    emp1.setLastName("baghel"); 
	    
	    //Employee 2
	    Employee emp2=new Employee();  
	    emp2.setEmpId("654527");
	    emp2.setFirstName("tarun");  
	    emp2.setLastName("verma");
	    
	    //User Role 1
	    UserRole userRole1 = new UserRole();
	    userRole1.setRoleName("Admin");
	      
	    //User Role 2
	    UserRole userRole2 = new UserRole();
	    userRole2.setRoleName("Tool user");
	    
	    //List<UserRole> 1
	    List<UserRole> userRoles1 = new ArrayList<UserRole>();
	    userRoles1.add(userRole1);
	    userRoles1.add(userRole2);
	    
	    emp1.setUserRoles(userRoles1);
	    
	    //List<UserRole> 2
	    List<UserRole> userRoles2 = new ArrayList<UserRole>();
	    userRoles2.add(userRole1);
	    
	    emp2.setUserRoles(userRoles2);
	      
	    session.save(emp1);  
	    session.save(emp2);
		
	    String sql = "FROM Employee";
		Query query = session.createQuery(sql);
		List<Employee> list = query.list();
		
		for (Employee emp : list) {
			System.out.println("Id : "+emp.getId()+" ,FirstName : "+emp.getFirstName()+" ,LastName : "
					+emp.getLastName());
		}
		
		transaction.commit();
		session.close();
		System.out.println("Successfully done");
		
	}

}
