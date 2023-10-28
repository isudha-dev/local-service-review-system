package com.localservicesreview.servicemanagementservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseModel{
    @OneToOne
    @JoinColumn(name = "service_id")
    private Service service;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postalCode;
    private String country;


}
