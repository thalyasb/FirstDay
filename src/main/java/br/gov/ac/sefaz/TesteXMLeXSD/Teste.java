package br.gov.ac.sefaz.TesteXMLeXSD;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Teste {
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException{
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		Document document = builder.parse("target/vendas.xml");
		
		NodeList formasDePagamento = document.getElementsByTagName("formaDePagamento");
        Element fdp= (Element) formasDePagamento.item(0);
        String formaDePagamento = fdp.getTextContent();
        System.out.println(formaDePagamento);
    
	}

}
