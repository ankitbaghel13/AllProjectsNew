package xmlParsing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParsing {

	public static void main(String[] args) throws ParserConfigurationException,
	SAXException, IOException {

		domParserDemo();

	}

	private static void domParserDemo() throws ParserConfigurationException,
	SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();
		/*Document document = builder.parse(ClassLoader
				.getSystemResourceAsStream("C:/Learn Java/Practice/Employee.xml"));
*/
		
		  File fXmlFile = new File("Employee.xml"); 
		  Document document = builder.parse(fXmlFile);
		 

		List<Employee> empList = new ArrayList<Employee>();

		NodeList nodeList = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);
			if (node instanceof Element) {
				Employee emp = new Employee();
				//Employee emp = (Employee)Class.forName("Employee").newInstance();
				emp.id = node.getAttributes().getNamedItem("id").getNodeValue();

				NodeList chilNodeList = node.getChildNodes();

				for (int j = 0; j < chilNodeList.getLength(); j++) {

					Node cNode = chilNodeList.item(j);

					if (cNode instanceof Element) {
						String content = cNode.getLastChild().getTextContent()
								.trim();
						String nodeName = cNode.getNodeName();

						if (nodeName == "firstName")
							emp.firstName = content;
						else if (nodeName == "lastName")
							emp.lastName = content;
						else if (nodeName == "location")
							emp.location = content;

					}
				}
				empList.add(emp);
			}
		}

		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}

class Employee {
	String id;
	String firstName;
	String lastName;
	String location;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", location=" + location + "]";
	}

}