package com.spring;

public class Student {
	private String name;
	private int id;
	Address address;
	
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


	protected Student(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}


	public void show() {
		System.out.print("Student [name=" + name + ", id=" + id + "Address=" +address.toString()+"]");
	}
	
	
		
}
