package com.localservicesreview.servicemanagementservice.models;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
    @Id
    private UUID id;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;

}
