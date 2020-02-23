package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String...args) {
	String []files = new String[] {"Objects.xml","Fruits.xml","Crickter.xml","CountryDistances.xml","CountryCapitalDistances.xml"};
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
	Objects objects=(Objects)applicationContext.getBean("objectbean0");
	objects.show();
	}
}
