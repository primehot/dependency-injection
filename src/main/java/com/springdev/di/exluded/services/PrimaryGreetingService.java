package com.springdev.di.exluded.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by oleht on 11.12.2017
 */
@Service
@Primary
//Add default profile
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primary Hello!";
    }
}