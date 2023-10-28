package com.localservicesreview.servicemanagementservice.services;

import org.springframework.stereotype.Service;
import com.localservicesreview.servicemanagementservice.repositories.ServiceRepo;

@Service
public class ServiceService {
    private ServiceRepo serviceRepo;
    public ServiceService(ServiceRepo serviceRepo){
        this.serviceRepo = serviceRepo;
    }

}
