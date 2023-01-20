package com.example.sfgdi.services;

import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Property";
    }
}
