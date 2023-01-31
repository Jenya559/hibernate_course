package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    //private String name;

    // public String getName() {
    //     return name;
    //   }

  /*  public void setName(String name) {
        this.name = name;
    }*/

    public Dog() {
        System.out.println("Dog been is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
    public void init(){
        System.out.println("Class Dog:init method");
    }
    public void destroy(){
        System.out.println("Class Dog:init destroy");
    }
}
