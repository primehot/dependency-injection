package com.springdev.di.dependencyinjection.controllers.manual.examples;

import com.springdev.di.dependencyinjection.services.GreetingService;

/**
 * Created by oleht on 11.12.2017
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
