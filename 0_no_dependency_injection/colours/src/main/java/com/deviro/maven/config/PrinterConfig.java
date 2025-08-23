package com.deviro.maven.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.ColourPrinterImpl;
import com.deviro.maven.services.impl.EnglishBluePrinter;
import com.deviro.maven.services.impl.EnglishGreenPrinter;
import com.deviro.maven.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
  public BluePrinter bluePrinter() {
    return new EnglishBluePrinter();
  }

  public RedPrinter redPrinter() {
    return new EnglishRedPrinter();
  }

  public GreenPrinter greenPrinter() {
    return new EnglishGreenPrinter();
  }

  public ColourPrinter colourPrinter(
      BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
    return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}
