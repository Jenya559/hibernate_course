package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    public Person() {
//        System.out.println("Person bean is created");
//    }
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person:set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person:set age");
        this.age = age;
    }
//@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person:set Pet");
        this.pet = pet;
    }
//    @Autowired
//        public Person(Pet pet) {
//            System.out.println("Person bean is created");
//        this.pet = pet;
//    }
    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
}
