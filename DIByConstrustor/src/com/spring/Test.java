package com.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  
@SuppressWarnings("deprecation")
public class Test {
	public static void main(String ...args) {

		Resource resource = new ClassPathResource("Bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student student0=(Student)factory.getBean("studentbean0");
		student0.show();
		
		Student student1=(Student)factory.getBean("studentbean1");
		student1.show();
		
		Student student2=(Student)factory.getBean("studentbean2");
		student2.show();
	}
}
