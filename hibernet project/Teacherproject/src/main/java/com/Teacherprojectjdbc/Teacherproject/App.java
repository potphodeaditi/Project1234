package com.Teacherprojectjdbc.Teacherproject;
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
    public static void main(String[] args)
    {
        //System.out.println( "Hello World!" );
        
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	//Is The Session Factory Is closed ?
    	System.out.println(factory.isClosed());
    	
    	//create the student table
    	Teacher s1 = new Teacher();
    	s1.setId(301);
    	s1.setName("aditi");
    	
    	
    	//create the course
    	Course c1=new Course();
    	c1.setCid(101);
    	c1.setCname("c++");
    	
    	s1.setCourse(c1); //setting course in teacher object
    	c1.setTeacher(s1); // setting the Teacher in course object
    	Session session = factory.openSession();
    	
    	//begin the transaction
    	Transaction tx = session.beginTransaction();
    	
    	session.save(s1);
    	session.save(c1);
    	tx.commit();
    	session.close();
    	factory.close();

    }

}