package com.Teacherprojectjdbc.Teacherproject;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name="Teacher_table")
public class Teacher 
{
	
	@Id
	private int Id;
	
	private String Name;
	
	 @OneToOne  @JoinColumn(name="Teacher_course_Id")
	
	  private Course course;
	
	//set getter and setter method
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
		public Course getCourse() {
			return course;
		}
		public void setCourse(Course course) {
			this.course = course;
		}
	
	
	
	
	
	
	public Teacher(int id, String name) {
		super();
		Id = id;
		Name = name;
		
	}
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
	
	
}

