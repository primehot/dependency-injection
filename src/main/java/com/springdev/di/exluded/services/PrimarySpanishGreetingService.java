package com.springdev.di.exluded.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by oleht on 11.12.2017
 */
//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
