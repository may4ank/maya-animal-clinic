package com.example.mayaanimalclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryServiceimpl implements GreetingServices{
    @Override
    public String greet() {
        return ("Hello Primary greeting");
    }
}
