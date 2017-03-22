/*
 * 
 * @author rushdi
 *
 */

package net.bhl.cdt.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import net.bhl.cdt.model.system.Component;
import net.bhl.cdt.model.system.DecimalNumber;
import net.bhl.cdt.model.system.StringValue;
import net.bhl.cdt.model.system.SystemFactory;

public class CPACSXmlParser implements IXMLParser {

	public final String startNode = "<vehicles>";

	public CPACSXmlParser() {

	}

	public CPACSXmlParser(String filePath) {
		// TODO Auto-generated constructor stub

		XMLEventReader eventReader = getXmlFile(filePath);
		if (eventReader != null)
			try {
				readXMLFile(eventReader);
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public XMLEventReader getXmlFile(String filePath) {
		// TODO Auto-generated method stub
		try {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(filePath));
			return eventReader;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Xml file Exception : " + e.getStackTrace());
		}

		return null;
	}

	@Override
	public void readXMLFile(XMLEventReader eventReader) throws XMLStreamException {
		// TODO Auto-generated method stub
		;

	}

	@Override
	public void readXMLByNode(String filePath)
			throws SAXException, IOException, ParseException, ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document document = (Document) docBuilder.parse(new File(filePath));

		NodeList nl = document.getDocumentElement().getChildNodes();
		// System.out.println("nole : " + nl.getLength());

		for (int k = 0; k < nl.getLength(); k++) {
			// Node node = (Node) nl.item(k);

			if (nl.item(k).getNodeName().equalsIgnoreCase("vehicles")) {
				Component vehicles = SystemFactory.eINSTANCE.createComponent();

				printTags((Node) nl.item(k), vehicles);
			}
		}

	}

	public static void printTags(Node nodes, Component rootNode) {
		if (nodes.hasChildNodes()) {
			NodeList nl = nodes.getChildNodes();
			// System.out.println("nole : " + nl.getLength());
			for (int j = 0; j < nl.getLength(); j++) {
				if (!nl.item(j).getNodeName().equalsIgnoreCase("#text") && !nl.item(j).getTextContent().isEmpty()) {
					Component c = SystemFactory.eINSTANCE.createComponent();
					c.setName(nl.item(j).getNodeName());
					
					if(nl.item(j).getTextContent().isEmpty() || nl.item(j).getTextContent() != null){
						if(isNumeric(nl.item(j).getTextContent())){
							DecimalNumber numberValue = SystemFactory.eINSTANCE.createDecimalNumber();
							Double.parseDouble(nl.item(j).getTextContent());
							//c.getSubcomponents().add(numberValue);
						}else{
							StringValue stringValue = SystemFactory.eINSTANCE.createStringValue();
							stringValue.setValue(nl.item(j).getTextContent());
							//c.getSubcomponents().add(stringValue);
						}
					}
					
					
					rootNode.getSubcomponents().add(c);
					System.out.println(nl.item(j).getNodeName() + " : " + nl.item(j).getTextContent());
					printTags(nl.item(j), c);
				}
			}
		}
	}

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
