package com.localservicesreview.servicemanagementservice.models;

import java.util.UUID;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photo extends BaseModel{
    private UUID serviceId;
    private String url;


}
