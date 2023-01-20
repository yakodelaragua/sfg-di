package com.example.sfgdi.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - From the PRIMARY Bean";
    }
}
