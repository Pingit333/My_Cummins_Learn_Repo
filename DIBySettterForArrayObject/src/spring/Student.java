package spring;

public class Student {

	private int id;
	private String name;
	Address []addresses;

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

	public Address[] getAddresses() {
		return addresses;
	}
	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	public void show() {
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		for(Address address:addresses) {
			System.out.println("Address ="+address.getLocation());
		}
	}
}
