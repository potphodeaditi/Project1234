package com.Studentprojectjdbc.Studentproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


 @Entity (name="Cource_Table")
 public class Course 
{
	@Id @Column(name="Cource_Id")
	private int cid;
	private String cname;
	@ManyToOne @JoinColumn(name="Student_id")
	private Student student;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course(int cid, String cname, Student student) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.student = student;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}


