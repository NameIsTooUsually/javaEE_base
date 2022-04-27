package com.chenhao.test.tset4;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo {
    public static void main(String[] args) throws DocumentException {
        //创建解析对象
        SAXReader saxReader = new SAXReader();
        //利用解析器把xml文件加载到内存中,并返回一个文档对象
        Document document = saxReader.read("C:\\Develop\\project\\AdvanceCode\\2022-4-19\\src\\com\\chenhao\\test\\tset4\\DemoXML.xml");
        //利用对象获取根目录
        Element rootElement = document.getRootElement();
        //获取根目录下的Element。可以根据Element名称获取，也可以全部获取
        List<Element> list = rootElement.elements("student");
        //从集合中可以拿到每一个每一个标签
        for (Element element : list) {
            //获取id
            Attribute attribute = element.attribute("id");
            String id = attribute.getValue();
            //获取name
            Element element1 = element.element("name");
            String name = element1.getText();
            //获取age
            Element element2 = element.element("");
        }
    }
}
