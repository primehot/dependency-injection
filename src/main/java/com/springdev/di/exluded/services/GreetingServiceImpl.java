package com.springdev.di.exluded.services;

import org.springframework.stereotype.Service;

/**
 * Created by oleht on 11.12.2017
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello All";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
