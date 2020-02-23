package com.spring;

public class Student {
	private String name;
	private int id;
	
	protected Student() {
		super();
	}
	
	
	protected Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	protected Student(int id) {
		super();
		this.id = id;
	}


	protected Student(String name) {
		super();
		this.name = name;
	}


	public void show() {
		System.out.print("Student [name=" + name + ", id=" + id + "]");
	}
	
	
		
}
