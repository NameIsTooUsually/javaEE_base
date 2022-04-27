package com.chenhao.test.test1;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //创建Xml解析器
        SAXReader reader = new SAXReader();
        //获document对象
        Document document = reader.read("C:\\Develop\\project\\AdvanceCode\\2022-4-19\\XML\\Student.XMl");
        //获取根标签
        Element rootElement = document.getRootElement();
        //获取根标签的标签
        List<Element> elements = rootElement.elements("student");
        //创建一个数组
        ArrayList<Student> list = new ArrayList<>();
        //遍历标签数组，获取标签下的内容
        for (Element element : elements) {
            //获取属性值
            Attribute id = element.attribute("id");
            String value = id.getValue();
            //System.out.println(value);
            //获取name
            Element name = element.element("name");
            String studentName = name.getText();
            //获取年龄
            Element age = element.element("age");
            String studentAge = age.getText();
            list.add(new Student(value,studentName,Integer.parseInt(studentAge)));
            //System.out.println(value+studentName+studentAge);
        }
        System.out.println(list);
    }
}
