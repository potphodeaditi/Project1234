package com.CourseProject.Courseroject;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
       
        Student s1=new Student();
        s1.setId(111);
        s1.setName("Aditi");
        
        Student s2=new Student();
        s2.setId(112);
        s2.setName("pooja");
        
        Student s3=new Student();
        s3.setId(113);
        s3.setName("Pranali");
        
        Course c1=new Course();
        c1.setCid(501);
        c1.setCname("java");
        
        Course c2=new Course();
        c2.setCid(502);
        c2.setCname("SQL");
        
        Course c3=new Course();
        c3.setCid(503);
        c3.setCname("Python");
        
        List<Course> list1=new ArrayList<Course>();
        List<Student> list2=new ArrayList<Student>();
        
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        
        list2.add(s1);
        list2.add(s2);
        list2.add(s3);
        
       
        Session session=factory.openSession();
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        tx.commit();
        session.close();
        factory.close();
        
        
    }
}

