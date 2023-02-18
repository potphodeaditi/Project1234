package com.fourthjdbc.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	//Is The Session Factory Is closed ?
    	System.out.println(factory.isClosed());
    	
    	//create Student
    	Student s1= new Student();
    	s1.setId(301);
    	s1.setName("aditi");
    	
    	//create the laptop
    	laptop l1=new laptop();
    	l1.setLid(101);
    	l1.setLname("lenove");
    	
    	
    	s1.setLaptop(l1); //setting course in teacher object
    	l1.setStudent(s1); // setting the Teacher in course object
    	Session session = factory.openSession();
    	
    	//begin the transaction
    	Transaction tx = session.beginTransaction();
    	
    	session.save(s1);
    	session.save(l1);
    	tx.commit();
    	session.close();
    	factory.close();

    }
}
