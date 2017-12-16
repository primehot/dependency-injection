package com.springdev.di.dependencyinjection.controllers;

import com.springdev.di.exluded.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by oleht on 11.12.2017
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello");

        return greetingService.sayGreeting();
    }
}
