package info.hpindia.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("spring.xml");
		Object object = container.getBean("Person");
		Person person=(Person)object;
		person.display();

	}

}
