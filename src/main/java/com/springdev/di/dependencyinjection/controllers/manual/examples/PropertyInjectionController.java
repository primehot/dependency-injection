package com.springdev.di.dependencyinjection.controllers.manual.examples;

import com.springdev.di.exluded.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by oleht on 11.12.2017
 */
@Controller
public class PropertyInjectionController {

    //Trick the name of variable suggest the implementation class of interface
    //But if we have the primaryBean, it will be used
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
