package com.Teacherprojectjdbc.Teacherproject;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Course_Table")
public class Course 
{
	@Id @Column(name="Course_Id")
	
	private int cid;
	private String cname;
	
	@OneToOne @JoinColumn(name="Teacher_id")
	
	private Teacher Teacher;
	 
	 //getter and setter

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	

	public Teacher getTeacher() {
		return Teacher;
	}

	public void setTeacher(Teacher teacher) {
		Teacher = teacher;
	}
	public Course(int id, String name) {
		super();
		cid = id;
		cname = name;
		
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
 
 }
