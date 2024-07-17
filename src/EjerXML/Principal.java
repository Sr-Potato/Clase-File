/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerXML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *1:11
 * @author sepy3
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        //Crear el objeto Document con el archivo XML
        Document document = builder.parse(new File("Nombre del fichero"));
        
        //Validar el XML
        document.getDocumentElement().normalize();
        
        //Extraer el nodo raiz
        Element root = document.getDocumentElement();
        
        
        
    }
}
