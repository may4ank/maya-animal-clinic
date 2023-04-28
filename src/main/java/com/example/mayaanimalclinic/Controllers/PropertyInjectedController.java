package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

     @Qualifier("propertlyInjectorService")
     @Autowired
    public GreetingServices greetingServices;


    public String printgreeting(){
        return (greetingServices.greet());

    }
}
