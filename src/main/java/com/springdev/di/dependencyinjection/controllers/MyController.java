package com.springdev.di.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by oleht on 11.12.2017
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!");

        return "foo";
    }
}
