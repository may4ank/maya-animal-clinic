package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.ConstructorServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
     propertyInjectedController = new PropertyInjectedController();
     propertyInjectedController.greetingServices = new ConstructorServicesImpl();

    }

    @Test
    void printgreeting() {

        System.out.println(propertyInjectedController.printgreeting());
    }
}