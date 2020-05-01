package com.miftaudeen.conference2.controller;

import com.miftaudeen.conference2.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration,
                                  BindingResult result){
        if(result.hasErrors()){
            System.out.println("There were errors");
            return "registration";
        }
        System.out.println(registration.getName());
        return "redirect:registration";
    }


}
