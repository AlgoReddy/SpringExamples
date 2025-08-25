package org.algoreddy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public void Dev(){
        System.out.println("Dev compiler");
    }
  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      Dev obj =(Dev) context.getBean("dev");
//      obj.setAge(18);
//      System.out.println(obj.getAge());
      obj.build();
}
}
