package com.springdev.di.dependencyinjection.controllers.manual.examples;

import com.springdev.di.dependencyinjection.services.GreetingService;
import com.springdev.di.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by oleht on 11.12.2017
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
