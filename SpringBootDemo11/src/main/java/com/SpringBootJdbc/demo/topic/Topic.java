package com.SpringBootJdbc.demo.topic;

public class Topic {
	
	private String id;
	private String course;
	private String description;
	
	public Topic() {
			}
	
	
	public Topic(String id, String course, String description) {
		super();
		this.id = id;
		this.course = course;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
