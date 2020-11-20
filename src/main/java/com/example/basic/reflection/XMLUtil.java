package com.example.basic.reflection;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;

/**
 * @Author Legion
 * @Create 2020/11/13 20:46
 */
public class XMLUtil {
    public static String getValue(){
        String value = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            URL url = XMLUtil.class.getResource("/reflection/person-config.xml");
            Document document = documentBuilder.parse(new File(url.getFile()));
            NodeList nodeList = document.getElementsByTagName("name");
            Node node = nodeList.item(0).getFirstChild();
            value = node.getNodeValue().trim();
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }
}
