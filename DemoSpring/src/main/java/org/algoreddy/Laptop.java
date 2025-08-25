package org.algoreddy;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop compiler");
    }
    public void compile(){
        System.out.println("compiling in laptop");
    }
}
