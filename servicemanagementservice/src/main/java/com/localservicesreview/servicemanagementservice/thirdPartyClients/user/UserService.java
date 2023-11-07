package com.localservicesreview.servicemanagementservice.thirdPartyClients.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.localservicesreview.servicemanagementservice.dtos.AuthenticationResponseDto;
import com.localservicesreview.servicemanagementservice.dtos.LoginRequestDto;
import com.localservicesreview.servicemanagementservice.dtos.ReviewDto;
import com.localservicesreview.servicemanagementservice.dtos.SignupRequestDto;

@Service
public class UserService {

    private RestTemplate restTemplate;
    private String usersUrl;
    private String signupEndpoint;
    private String loginEndpoint;
    public UserService(RestTemplateBuilder restTemplateBuilder, @Value("${users.url}") String usersUrl,
        @Value("${users.api.signup.endpoint}") String signupEndpoint, @Value("${users.api.login.endpoint}") String loginEndpoint){

        restTemplate = restTemplateBuilder.build();
        this.usersUrl = usersUrl;
        this.signupEndpoint = signupEndpoint;
        this.loginEndpoint = loginEndpoint;
    }

    public boolean validateToken(){
        return false;
    }

    public AuthenticationResponseDto createUser(SignupRequestDto requestDto){
        ResponseEntity<AuthenticationResponseDto> response = restTemplate.postForEntity(usersUrl+signupEndpoint, requestDto,
            AuthenticationResponseDto.class);
        return response.getBody();
    }

    public AuthenticationResponseDto loginUser(LoginRequestDto requestDto){
        ResponseEntity<AuthenticationResponseDto> response = restTemplate.postForEntity(usersUrl+loginEndpoint, requestDto,
            AuthenticationResponseDto.class);
        return response.getBody();
    }

    public Object logoutUser(){
        return null;
    }

    public Object getUserIdForToken(){
        return null;
    }
}
