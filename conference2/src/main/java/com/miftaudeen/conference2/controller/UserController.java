package com.miftaudeen.conference2.controller;

import com.miftaudeen.conference2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Miftaudeen") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Abdulhameed") String lastName,
                        @RequestParam(value = "age", defaultValue = "24") int age
                        ){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstname: "+ user.getFirstName());

        return user;
    }


}
