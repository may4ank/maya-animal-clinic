package com.example.mayaanimalclinic.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorServicesImpl implements GreetingServices {
    @Override
    public String greet() {
        System.out.println("In here");
        return "Hello World - Constructor";
    }
}
