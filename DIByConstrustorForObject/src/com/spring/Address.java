package com.spring;

public class Address {

	private String address;

	protected Address() {
		super();
	}

	protected Address(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	
}
