package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Setter";
    }
}
