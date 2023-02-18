package com.fourthjdbc.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Student_table")
public class Student 
{
	
	@Id
	private int Id;
	
	private String Name;
	
	 @OneToOne  @JoinColumn(name="Student_laptop_Id")
	
	  private laptop Laptop;
	 
	// add getter and setter method

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public laptop getLaptop() {
		return Laptop;
	}

	public void setLaptop(laptop laptop) {
		Laptop = laptop;
	}

	public Student(int id, String name, laptop laptop) {
		super();
		Id = id;
		Name = name;
		Laptop = laptop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	 

}
