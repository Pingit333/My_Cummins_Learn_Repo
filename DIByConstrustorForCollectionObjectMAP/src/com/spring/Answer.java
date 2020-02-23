package com.spring;

public class Answer {
	private String name;
	
	protected Answer() {
		super();
	}

	protected Answer(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Answer [ name=" + name + "]";
	}
	
}
