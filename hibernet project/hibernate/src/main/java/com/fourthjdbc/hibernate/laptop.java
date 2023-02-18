package com.fourthjdbc.hibernate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="laptop_Table")
public class laptop 
{
	@Id @Column(name="laptop_Id")
	
	private int lid;
	private String lname;
	
	@OneToOne @JoinColumn(name="Student_id")
	
	private Student  Student;
	
	
	//geterr and setter method

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return getStudent();
	}

	public void setStudent(Student Student) {
	     this.Student = Student;
	}
	
	

	
	public laptop(int lid, String lname, com.fourthjdbc.hibernate.Student student) {
		super();
		this.lid = lid;
		this.lname = lname;
		Student = student;
	}

	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	 
	 
	

	
 
 }

