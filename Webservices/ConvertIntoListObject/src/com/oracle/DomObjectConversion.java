package com.oracle;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomObjectConversion {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse("employees.xml");
		
		NodeList employeeNodeList = document.getElementsByTagName("employee");
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for(int i=0;i<employeeNodeList.getLength();i++) {
			Employee employee = new Employee();
			Element employeeElement=(Element)employeeNodeList.item(i);
			employee.setEno(Integer.parseInt(employeeElement.getElementsByTagName("eno").item(0).getTextContent()));
			employee.setName(employeeElement.getElementsByTagName("name").item(0).getTextContent());
			employee.setSalary(Double.parseDouble(employeeElement.getElementsByTagName("salary").item(0).getTextContent()));
			empList.add(employee);
			
		}
		empList.forEach(employee -> {
			System.out.println(employee.getEno());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		});
	}

}
