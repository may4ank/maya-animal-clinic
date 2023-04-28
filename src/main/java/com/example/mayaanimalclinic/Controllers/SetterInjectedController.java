package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Qualifier("setterInjectService")
    @Autowired
    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreet() {

       return(greetingServices.greet());


}
}
