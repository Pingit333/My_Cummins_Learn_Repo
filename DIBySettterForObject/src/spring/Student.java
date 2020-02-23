package spring;

public class Student {
	
	private int id;
	private String name;
	Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void show() {
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		System.out.println("Address ="+address.getLocation());
	}
	
}
