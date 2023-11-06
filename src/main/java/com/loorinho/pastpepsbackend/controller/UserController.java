package com.loorinho.pastpepsbackend.controller;

import com.loorinho.pastpepsbackend.model.user.User;
import com.loorinho.pastpepsbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public HashMap register(@RequestBody User user){
            return userService.register(user);
    }
}
