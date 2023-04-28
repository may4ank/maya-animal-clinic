package com.example.mayaanimalclinic;

import com.example.mayaanimalclinic.Controllers.ConstructorInjectedController;
import com.example.mayaanimalclinic.Controllers.PrimaryGreetingController;
import com.example.mayaanimalclinic.Controllers.PropertyInjectedController;
import com.example.mayaanimalclinic.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class MayaAnimalClinicApplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext =  SpringApplication.run(MayaAnimalClinicApplication.class, args);

        System.out.println("------------Primary Controller");

        PrimaryGreetingController primaryGreetingController = (PrimaryGreetingController) applicationContext.getBean("primaryGreetingController");

        System.out.println(primaryGreetingController.getGreet());

        System.out.println("------------Property Injected Controller");


        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");

       System.out.println(propertyInjectedController.printgreeting());

       System.out.println("=============Setter based Controller");

        SetterInjectedController setterInjectedController;

        setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreet());

        System.out.println("=============Const based Controller");

        ConstructorInjectedController constructorInjectedController;

        constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.printgreeting());

    }

}
