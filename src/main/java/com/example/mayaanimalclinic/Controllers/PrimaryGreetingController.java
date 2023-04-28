package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryGreetingController {

    private final GreetingServices greetingServices;

    public PrimaryGreetingController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreet() {

        return (greetingServices.greet());

    }


}
