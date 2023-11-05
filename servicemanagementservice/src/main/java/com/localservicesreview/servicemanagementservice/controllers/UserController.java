package com.localservicesreview.servicemanagementservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.localservicesreview.servicemanagementservice.thirdPartyClients.user.UserService;

@Controller
@RequestMapping("/auth")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public Object createUser(){
        return userService.createUser();
    }

    @PostMapping("/login")
    public Object loginUser(){
        return userService.loginUser();
    }

    @PostMapping("/logout")
    public Object logoutUser(){
        return userService.logoutUser();
    }

    public Object validateToken(){
        return userService.validateToken();
    }

    public Object getUserIdForToken(){
        return userService.getUserIdForToken();
    }
}
