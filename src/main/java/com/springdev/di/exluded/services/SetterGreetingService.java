package com.springdev.di.exluded.services;

import org.springframework.stereotype.Service;

/**
 * Created by oleht on 11.12.2017
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from GetterGreetingService";
    }
}
