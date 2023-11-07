package com.localservicesreview.servicemanagementservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.localservicesreview.servicemanagementservice.dtos.AuthenticationResponseDto;
import com.localservicesreview.servicemanagementservice.dtos.LoginRequestDto;
import com.localservicesreview.servicemanagementservice.dtos.SignupRequestDto;
import com.localservicesreview.servicemanagementservice.thirdPartyClients.user.UserService;

@Controller
@RequestMapping("/auth")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponseDto> createUser(@RequestBody SignupRequestDto request){
        return new ResponseEntity<>(userService.createUser(request), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponseDto> loginUser(@RequestBody LoginRequestDto request){
        return new ResponseEntity<>(userService.loginUser(request), HttpStatus.OK);
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
