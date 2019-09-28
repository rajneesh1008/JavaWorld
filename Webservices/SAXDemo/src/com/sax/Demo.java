package com.sax;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Demo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
	SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	SAXParser saxParser = saxParserFactory.newSAXParser();
	EmployeeHandler employeeHandler=new EmployeeHandler();
	saxParser.parse(new File("employees.xml"),employeeHandler);
	ArrayList<Employee> empList=employeeHandler.getEmployees();
	empList.forEach(employee -> {
		System.out.println(employee.getEno());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	});
	}

}
