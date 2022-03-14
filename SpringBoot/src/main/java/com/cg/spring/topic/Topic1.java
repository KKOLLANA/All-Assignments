package com.cg.spring.topic;

public class Topic1 {
	 //initializing 
	private String id;
	private String name;  
	private String description;
	//Empty Constructor
	public Topic1() {
	}
	//Parematerised Constructor
public Topic1(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
