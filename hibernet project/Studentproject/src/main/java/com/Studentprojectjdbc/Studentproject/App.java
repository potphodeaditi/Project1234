package com.Studentprojectjdbc.Studentproject;

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
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
        //is the session factory closed?
      // System.out.println(factory.isClosed());
        
        //create the Student class object
        Student s2=new Student();
        s2.setSid(10);
        s2.setSname("Aditi");
        
        Course c2=new Course();
        c2.setCid(501);
        c2.setCname("C Programming"); 
        c2.setStudent(s2);//setting the course for course object
        
        Course c3=new Course();
        c3.setCid(502);
        c3.setCname("java"); 
        c3.setStudent(s2);//setting the course for course object
        
        Course c4=new Course();
        c4.setCid(503);
        c4.setCname("SQL"); 
        c4.setStudent(s2);//setting the course for course object
        
        //creating the list of course to associated with 1 student
        List<Course> list=new ArrayList<Course>();
        list.add(c2);
        list.add(c3);
        list.add(c4);
        //setting the course with the student
        s2.setCourse(list);
        
        Session session=factory.openSession();
        
        //begin the transaction
        
        Transaction tx=session.beginTransaction();
        session.save(s2);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        tx.commit();
        session.close();
        factory.close();
        
        
    }
}
