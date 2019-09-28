package com.oracle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMDemo {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element rootElement = document.createElement("employees");
		Element employeeElement = document.createElement("employee");
		Element enoElement = document.createElement("eno");
		enoElement.setTextContent("10");
		Element nameElement = document.createElement("name");
		nameElement.setTextContent("Anil");
		document.appendChild(rootElement);
		rootElement.appendChild(employeeElement);
		employeeElement.appendChild(enoElement);
		employeeElement.appendChild(nameElement);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document),new StreamResult("demo.xml"));
	}

}

