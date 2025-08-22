package com.maven.ColoursApplication;

import org.apache.commons.logging.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@log
public class ColoursApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }
    @Override
    final ColourPrinter colourPrinter = new ColourPrinterImpl();
    Log.info(colourPrinter.print());

}
