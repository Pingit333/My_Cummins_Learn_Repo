package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test {
	public static void main(String...args) {
	Resource resource = new ClassPathResource("Bean.xml");
	BeanFactory beanfactory = new XmlBeanFactory(resource);
	Objects objects=(Objects)beanfactory.getBean("objectbean0");
	objects.show();
	}
}
