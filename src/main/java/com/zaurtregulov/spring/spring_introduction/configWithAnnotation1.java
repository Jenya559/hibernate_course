package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
Person person=context.getBean("personBean", Person.class);
person.callYourPet();
    }
}
