package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");

        Student1 s1 = (Student1) context.getBean("s1");
        s1.internship();

        Student2 s2 = (Student2) context.getBean("s2");
        s2.internship();

        Student3 s3 = (Student3) context.getBean("s3");
        s3.internship();

        Student4 s4 = (Student4) context.getBean("s4");
        s4.internship();

        Springboot boot = (Springboot) context.getBean("fun");
        boot.Hello("Siva");
    }
}