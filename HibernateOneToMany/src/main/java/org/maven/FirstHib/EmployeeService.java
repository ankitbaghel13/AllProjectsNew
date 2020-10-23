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
		
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
				
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();*/
		
		//Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		//Persist
		//============================================================================
		//============================================================================
		
		
		/*Employee employee = new Employee();
		//employee.setId(123459);
		employee.setFirstName("first");
		employee.setLastName("last");*/
		
		//session.save(employee);
		
		Employee e1=new Employee();  
	    e1.setEmpId("654924");  
	    e1.setFirstName("ankit");  
	    e1.setLastName("baghel"); 
	    
	    UserRole u1 = new UserRole();
	    u1.setRoleName("Admin");
	    /*e1.setUserRole(u1);
	    u1.setEmployee(e1);*/
	      
	   /* Employee e2=new Employee();  
	   // e2.setId(239); 
	    e2.setEmpId("654527");
	    e2.setFirstName("tarun");  
	    e2.setLastName("verma");*/
	    
	    UserRole u2 = new UserRole();
	    u2.setRoleName("Tool user");
	    
	    List<UserRole> userRoles = new ArrayList<UserRole>();
	    /*u1.setEmployee(e1);
	    u2.setEmployee(e1);*/
	    
	    userRoles.add(u1);
	    userRoles.add(u2);
	    e1.setUserRoles(userRoles);
	      
	    session.save(e1);  
	    //session.save(u2);
		
		
		//Select
		//===============================================================================
		//===============================================================================
		
		
		//String sql = "FROM Employee";
		//String sql = "FROM Employee e where e.firstName like '%kit'";
		
		//String sql = "FROM Employee e where e.id =:emp_id";
	    String sql = "FROM Employee";
		Query query = session.createQuery(sql);
		//query.setParameter("emp_id", 2);
		
		//No of results
		//===============================================================================
		//===============================================================================
		/*query.setFirstResult(0);
		query.setMaxResults(2);*/
		List<Employee> list = query.list();
		
		//UPDATE
		//===============================================================================
		//===============================================================================
		/*String hql = "UPDATE Employee set firstName = 2400 WHERE id = 234";
		int result = query.executeUpdate();*/
		
		
		//DELETE
		//===============================================================================
		//===============================================================================
		/*String hql = "DELETE FROM Employee WHERE id = 234";
		int result = query.executeUpdate();*/
		
		/*for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee1 = (Employee) iterator.next();
			System.out.println("Id : "+employee1.getId()+" ,FirstName : "+employee1.getFirstName()+" ,LastName : "
			+employee1.getLastName());
		}*/
		
		for (Employee emp : list) {
			System.out.println("Id : "+emp.getId()+" ,FirstName : "+emp.getFirstName()+" ,LastName : "
					+emp.getLastName());
		}
		
		
		//Unique Results
		//===============================================================================
		//===============================================================================
		/*query.setMaxResults(1);
		Employee emp = (Employee)query.uniqueResult();
		System.out.println(emp.getId());*/
		
		
		//Insert
		//============================================================================
		//============================================================================
		/*String hql = "INSERT INTO Employee(firstName, lastName, salary)"  + 
	             "SELECT firstName, lastName, salary FROM old_employee";
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);*/
		
		
		transaction.commit();
		session.close();
		System.out.println("Successfully done");
		
	}

}
