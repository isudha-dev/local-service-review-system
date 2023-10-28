package com.localservicesreview.servicemanagementservice.models;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseModel {
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Set<Service> services;

}