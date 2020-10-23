package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class EmployeeService 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	/*Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();*/
    	
    	Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Employee emp = new Employee();
    	emp.setName("Ankit");
    	
    	Regular_Employee regEmp = new Regular_Employee();
    	regEmp.setName("Suresh");
    	regEmp.setSalary(25000);
    	regEmp.setBonus(4000);
    	
    	Contract_Employee conEmp = new Contract_Employee();
    	Contract_Employee conEmp1 = new Contract_Employee();
    	conEmp.setName("Ramesh");
    	conEmp.setPay_per_hour(300);
    	conEmp.setContract_duration("8");
    	
    	conEmp1.setName("Damesh");
    	conEmp1.setPay_per_hour(400);
    	conEmp1.setContract_duration("9");
    	
    	//session.save(emp);
    	session.persist(emp);
    	session.persist(regEmp);
    	session.persist(conEmp);
    	session.persist(conEmp1);
    	transaction.commit();
    	session.close();
    	System.out.println("Successfully saved");
    	
    }
}
