package com.spring;

public class User {
	private String username;

	protected User() {
		super();
	}

	protected User(String username) {
		super();
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
	
	
	
}
