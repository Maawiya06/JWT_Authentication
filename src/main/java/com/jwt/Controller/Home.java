package com.jwt.Controller;

import com.jwt.Model.Users;
import com.jwt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Home {

    @Autowired
    private UserService userservice;


    @GetMapping("/welcome")
    public List<Users> Welcome(){
        System.out.println("getting users");
        return this.userservice.getUsers();
    }
}
