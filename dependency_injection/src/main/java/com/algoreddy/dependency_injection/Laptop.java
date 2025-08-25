package com.algoreddy.dependency_injection;

import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer{
    public void compile() {
        System.out.println("compiling with 404 bugs");
    }

}
