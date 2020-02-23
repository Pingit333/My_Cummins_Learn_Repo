package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext applicationContext;

	public static void main(String...args) {
	applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
	Student student= (Student)applicationContext.getBean("studentbean0");
	student.show();
	}
}
