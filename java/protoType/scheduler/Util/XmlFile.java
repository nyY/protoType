package protoType.scheduler.Util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlFile {

	private Document document;

	public void init() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			this.document = builder.newDocument();
		} catch (ParserConfigurationException e) {
			LogUtil.setErrorLog(e.getMessage());
		}
	}

	// for test
	public void createXml(String fileName) {
		Element event = this.document.createElement("event");
		this.document.appendChild(event);

		Element eventId = this.document.createElement("eventId");
		eventId.appendChild(this.document.createTextNode("111223"));
		event.appendChild(eventId);

		Element eventName = this.document.createElement("eventName");
		eventName.appendChild(this.document.createTextNode("aaaaaaa"));
		event.appendChild(eventName);

		Element eventDetail = this.document.createElement("eventDetail");
		eventDetail.appendChild(this.document
				.createTextNode("aaaaaaabbbbbbbbbbbbbbbb"));
		event.appendChild(eventDetail);
		
		//TODO create option's node & selection's node

		
		/*
		
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<event>
			<eventId>111223</eventId>
			<eventName>aaaaaaa</eventName>
			<eventDetail>aaaaaaabbbbbbbbbbbbbbbb</eventDetail>
			<eventOptions>
				<option>
					<optionId>1</optionId>
					<optionName>aaaaaaa</optionName>
					<optionDetail>aaaaaaabbbbbbbbbbbbbbbb</optionDetail>
					<optionId>2</optionId>
					<optionName>aaaaaaa</optionName>
					<optionDetail>aaaaaaabbbbbbbbbbbbbbbb</optionDetail>
				</option>
			</eventOptions>
			<userSelections>
				<selection>
					<userId>1</userId>
					<userName>eeeee</userName>
					<eventId>1</eventId>
					<optionId>1</optionId>
					<selectFlg>true</selectFlg>
				</selection>
				<selection>
					<userId>2</userId>
					<userName>dddd</userName>
					<eventId>1</eventId>
					<optionId>2</optionId>
					<selectFlg>true</selectFlg>
				</selection>
			</userSelections>
		</event>*/
		

		
		
		
		TransformerFactory tf = TransformerFactory.newInstance();
		try {
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(document);
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			LogUtil.setInfoLog("createXml success");
		} catch (TransformerConfigurationException e) {
			LogUtil.setErrorLog(e.getMessage());
		} catch (IllegalArgumentException e) {
			LogUtil.setErrorLog(e.getMessage());
		} catch (FileNotFoundException e) {
			LogUtil.setErrorLog(e.getMessage());
		} catch (TransformerException e) {
			LogUtil.setErrorLog(e.getMessage());
		}
	}

	// for test
	/*
	 * public void parserXml(String fileName) { try { DocumentBuilderFactory dbf
	 * = DocumentBuilderFactory.newInstance(); DocumentBuilder db =
	 * dbf.newDocumentBuilder(); Document document = db.parse(fileName);
	 * 
	 * NodeList eventIds = document.getChildNodes(); for (int i = 0; i <
	 * eventIds.getLength(); i++) { Node eventId = eventIds.item(i); NodeList
	 * eventIdInfo = eventId.getChildNodes(); for (int j = 0; j <
	 * eventIdInfo.getLength(); j++) { Node node = eventIdInfo.item(j); NodeList
	 * eventIdMeta = node.getChildNodes(); for (int k = 0; k <
	 * eventIdMeta.getLength(); k++) {
	 * LogUtil.setErrorLog(eventIdMeta.item(k).getNodeName() + ":" +
	 * eventIdMeta.item(k).getTextContent()); } } }
	 * 
	 * } catch (FileNotFoundException e) { LogUtil.setErrorLog(e.getMessage());
	 * } catch (ParserConfigurationException e) {
	 * LogUtil.setErrorLog(e.getMessage()); } catch (SAXException e) {
	 * LogUtil.setErrorLog(e.getMessage()); } catch (IOException e) {
	 * LogUtil.setErrorLog(e.getMessage()); } }
	 */
}
