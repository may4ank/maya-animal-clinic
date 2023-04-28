package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.ConstructorServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorServicesImpl());
    }

    @Test
    void printgreeting() {
        System.out.println(constructorInjectedController.printgreeting());
    }
}