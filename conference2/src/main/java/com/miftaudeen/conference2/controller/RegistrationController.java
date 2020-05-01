package com.miftaudeen.conference2.controller;

import com.miftaudeen.conference2.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration")Registration registration){
        System.out.println(registration.getName());
        return "redirect:registration";
    }


}
