package com.example.designPattern.abstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;

/**
 * @Author Legion
 * @Create 2020/11/14 14:52
 */
public class XMLUtil {
    public static Object getBean(){
        Object obj = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            URL url = XMLUtil.class.getResource("/designPattern/abstractFactory-config.xml");
            Document document = documentBuilder.parse(new File(url.getFile()));
            NodeList nodeList = document.getElementsByTagName("skinFactory");
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue();
            className = "com.example.designPattern.abstractFactory.factory." + className;
            Class<?> c = Class.forName(className);
            obj = c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
