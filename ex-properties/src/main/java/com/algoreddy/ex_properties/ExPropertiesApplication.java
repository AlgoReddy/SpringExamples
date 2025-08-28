package com.algoreddy.ex_properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class ExPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExPropertiesApplication.class, args);
    }

    @Override
    public void run(final String ... args){
        final PizzaConfig pizzaConfig = new PizzaConfig("tomato", "mozzarilla","thin");

    }

    Log.info(
        String.format("i want a %s crust pizza , with %s and %s sauce",
        pizzaConfig.getCrust(),
         pizzaConfig.getTopping(),
         pizzaConfig.getSauce()
         ));

}
