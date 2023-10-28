package com.localservicesreview.servicemanagementservice.controllers;

import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.localservicesreview.servicemanagementservice.dtos.CreateServiceRequestDto;
import com.localservicesreview.servicemanagementservice.dtos.CreateServiceResponseDto;
import com.localservicesreview.servicemanagementservice.dtos.GetServiceResponseDto;
import com.localservicesreview.servicemanagementservice.dtos.SearchServiceResponseDto;
import com.localservicesreview.servicemanagementservice.dtos.UploadPhotoResponseDto;
import com.localservicesreview.servicemanagementservice.services.ServiceService;

@Controller
@RestController("/services")
public class ServiceController {
    private ServiceService serviceService;
    public ServiceController(ServiceService serviceService){
        this.serviceService = serviceService;
    }

    //post service
    @PostMapping
    public ResponseEntity<CreateServiceResponseDto> createService(@RequestBody CreateServiceRequestDto requestDto){


        return null;
    }

    //get service
    @GetMapping("{id}")
    public ResponseEntity<GetServiceResponseDto> getService(@PathVariable("id") UUID serviceId){
        return null;
    }

    //search service
    @GetMapping("/search")
    public ResponseEntity<SearchServiceResponseDto> searchService(@RequestParam(value = "input", required = true) String input,
        @RequestParam(value="categories", required = false) List<String> categoryNames,
        @RequestParam(value="ratings", required = false) List<Integer> ratings)
    {

        return null;

    }

    //add photo
    @PostMapping("{id}/photos")
    public ResponseEntity<UploadPhotoResponseDto> addPhotos(@PathVariable("id") UUID serviceId, @RequestParam("files") MultipartFile[] file, ModelMap modelMap){
        return null;
    }



}
