package inheritance;

public class Dog extends Aminal{
	public void type() {
		System.out.println("bulldog");
	}
	
	public static void main(String ... args) {
		
		Dog dog = new Dog();
		dog.m();//parent class method calling single level inheritance
		dog.type();//subclass method calling
	}
}
