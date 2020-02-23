package com.spring;

public class Answer {
	private int id;
	private String name;
	
	protected Answer() {
		super();
	}

	protected Answer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + "]";
	}
	
}
