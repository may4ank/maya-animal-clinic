package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.GreetingServices;
import com.example.mayaanimalclinic.services.ConstructorServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    GreetingServices greetingServices;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingServices(new ConstructorServicesImpl());
    }


    @Test
    void getGreet() {
        System.out.println(setterInjectedController.getGreet());
    }
}