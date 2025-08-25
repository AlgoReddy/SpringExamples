package org.algoreddy;

public class Dev {
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;

    public Dev(){
        System.out.println("Dev constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private int age;

        public void build() {

            System.out.println("working is awesome ");
            comp.compile();
        }

    }


