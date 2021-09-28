package com.xdx.test;

import com.xdx.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlApplicationContextTest {
    public static void main(String[] args) {
        //从类路径下获取配置文件，生成ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //从容器中根据bean名称拿到bean
        Person person = (Person) classPathXmlApplicationContext.getBean("person");
        System.out.println(person.toString());
        ClassPathXmlApplicationContext classPathXmlApplicationContext2 = new ClassPathXmlApplicationContext("bean.xml");
        //从容器中根据bean名称拿到bean
        Person person2 = (Person) classPathXmlApplicationContext2.getBean("person");
        System.out.println(person.toString());
    }
}
