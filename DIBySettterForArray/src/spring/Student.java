package spring;

public class Student {

	private int id;
	private String name;
	private String []locations;

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

	
	public String[] getLocations() {
		return locations;
	}
	public void setLocations(String[] locations) {
		this.locations = locations;
	}
	public void show() {
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		for(String location:locations) {
			System.out.println("location= "+location);
		}
	}

}
