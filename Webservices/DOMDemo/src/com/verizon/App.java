package com.verizon;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse("employees.xml");
		/*Element rootElement = document.getDocumentElement();
		NodeList nodeList = rootElement.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				NodeList childNodes = node.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node item = childNodes.item(j);
					if (item.getNodeType() == Node.ELEMENT_NODE) {
						System.out.println(item.getNodeName()+ " "+item.getTextContent());*/
		NodeList empNodeList = document.getElementsByTagName("employee");
		for (int i = 0; i < empNodeList.getLength(); i++) {
			Element employeeElement = (Element) empNodeList.item(i);
			System.out.println(employeeElement.getElementsByTagName("eno").item(0).getTextContent());
			System.out.println(employeeElement.getElementsByTagName("name").item(0).getTextContent());
			System.out.println(employeeElement.getElementsByTagName("salary").item(0).getTextContent());
		}
				
			
		

	}
}

