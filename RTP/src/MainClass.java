
public class MainClass {
 public static void main(String ...args) {
	 
	 A a = new A();//super class obj and ref
	 B b = new B();//subclass obj and ref
	 C c = new C();//subclass obj and ref
	 D d = new D();//subclass obj and ref
	 
	 A ref;// super class ref
	 
	 ref=a;
	 ref.m();//super class method
	 
	 
	 // Up-casting and RTP  because it decided at runtime which class method is called
	 ref=b;
	 ref.m();//sub class method by super class ref
	 
	 ref=c;
	 ref.m();// sub class method by super class ref
	 
	 ref=d;
	 System.out.print(ref.x);//data member call of sub class but it will call super class data member
	 
 }
}
