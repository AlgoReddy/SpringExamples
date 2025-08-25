package com.algoreddy.webapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
@RequestMapping("/")
public String greet(){
    return "welcome to the yeswanth channel";
}
@RequestMapping("/about")
public String  about(){
    return " i don't simply learn , i build";
}

}
