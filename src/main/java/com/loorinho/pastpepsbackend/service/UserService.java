package com.loorinho.pastpepsbackend.service;

import com.loorinho.pastpepsbackend.model.user.User;
import com.loorinho.pastpepsbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public HashMap register(User user){
        HashMap response = new HashMap();
        try{
//            user.setPassword(passwordEncoder.encode(user.getPassword()));

            response.put("status", "success");
            response.put("message", "User registered successfully");
            response.put("data", userRepository.save(user));
             return response;

        }catch (Exception e){
            response.put("status", "error");
            response.put("message", e.getMessage());
            return response;

        }

    }
}
