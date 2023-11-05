package com.localservicesreview.servicemanagementservice.thirdPartyClients.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private RestTemplate restTemplate;
    private String reviewsUrl;
    private String endpoint;
    public UserService(RestTemplateBuilder restTemplateBuilder, @Value("${users.url}") String reviewsUrl, @Value("${users.api.endpoint}") String endpoint){
        restTemplate = restTemplateBuilder.build();
        this.reviewsUrl = reviewsUrl;
        this.endpoint = endpoint;
    }

    public boolean validateToken(){
        return false;
    }

    public Object createUser(){
        return null;
    }

    public Object loginUser(){
        return null;
    }

    public Object logoutUser(){
        return null;
    }

    public Object getUserIdForToken(){
        return null;
    }
}
