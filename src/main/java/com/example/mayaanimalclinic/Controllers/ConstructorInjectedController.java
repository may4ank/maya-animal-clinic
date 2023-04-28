package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {

    private final GreetingServices greetingServices;


    public ConstructorInjectedController  (@Qualifier("constructorServicesImpl")GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }


    public String printgreeting() {
        return (greetingServices.greet());
    }

    }
