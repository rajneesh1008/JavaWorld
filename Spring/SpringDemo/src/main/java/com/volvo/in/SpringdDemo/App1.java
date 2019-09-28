package com.volvo.in.SpringdDemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App1 {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("applicationcontext.xml");
		container.getBean(Person.class);
	   
		
		
	}

}
