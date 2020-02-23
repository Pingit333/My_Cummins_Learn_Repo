package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext applicationContext;
	private static String files[];

	public static void main(String...args) {
	files = new String[] {"StudentBean.xml","AddressBean.xml"};
	applicationContext = new ClassPathXmlApplicationContext(files);
	Student student= (Student)applicationContext.getBean("studentbean0");
	student.show();
	}
}
