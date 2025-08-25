package com.algoreddy.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // we don't want to create a laptop object with the new keyword which makes it
    // our duty to handle it
    // private Laptop laptop = new Laptop();
    @Autowired // field injection
    private Laptop laptop;
    // constructor injection which don't require the @autowired annotation
    // public Dev(Laptop laptop) {
    // this.laptop = laptop;
    // }

    // setter injection requires the autowired
    // @Autowired
    // public void setLaptop(Laptop laptop){
    // this.laptop=laptop;
    // }

    public void build() {
        laptop.compile();
        System.out.println("working is awesome ");
    }

}
