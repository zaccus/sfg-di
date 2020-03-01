package com.zaccus.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Excelsior!");
        return "I am Spartacus";
    }
}
