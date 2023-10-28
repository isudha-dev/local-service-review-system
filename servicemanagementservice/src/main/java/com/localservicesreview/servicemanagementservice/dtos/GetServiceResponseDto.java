package com.localservicesreview.servicemanagementservice.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import com.localservicesreview.servicemanagementservice.models.Address;
import com.localservicesreview.servicemanagementservice.models.Category;
import com.localservicesreview.servicemanagementservice.models.Location;
import com.localservicesreview.servicemanagementservice.models.Period;
import com.localservicesreview.servicemanagementservice.models.Review;
import com.localservicesreview.servicemanagementservice.models.ServiceState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetServiceResponseDto {
    private UUID serviceId;
    private String name;
    private String phone_number;
    private String email;
    private Address address;
    private String formatted_address;
    private String website;
    private String ownerName;
    private UUID creatorId;
    private Set<Category> categories = new HashSet<>();
    private String google_map_link;
    private ServiceState serviceState;
    private Set<Period> weeklyOpenPeriods;
    private Location location;
    private boolean openNow;
    private double rating;
    private int totalUserRatings;
    private Set<Review> reviews;



}
