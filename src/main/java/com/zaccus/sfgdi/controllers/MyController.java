package com.zaccus.sfgdi.controllers;

import com.zaccus.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
//        System.out.println("Excelsior!");
//        return "I am Spartacus";
        return greetingService.sayGreeting();
    }
}
