package com.localservicesreview.servicemanagementservice.models;

import java.time.LocalDateTime;
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
public class Review extends BaseModel{
    private String authorName;
    private String language;
    private double rating;
    private String relativeTimeDescription;
    private String text;
    private LocalDateTime time;


}
