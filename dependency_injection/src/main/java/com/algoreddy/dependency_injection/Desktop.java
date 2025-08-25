package com.algoreddy.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("compiling with 404 bugs but more faster");

    }

}
