package com.localservicesreview.servicemanagementservice.models;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Service extends BaseModel {
    private UUID creatorId;
    private String name;
    private String phone_number;
    private String email;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    private Address address;
    private String formattedAddress;
    private String website;
    private String ownerName;
    @ManyToMany
    @JoinTable(
        name="service_category",
        joinColumns = @JoinColumn(name="service_id"),
        inverseJoinColumns = @JoinColumn(name="category_id")
    )
    private Set<Category> categories = new HashSet<>();
    private String google_map_link;
    private ServiceState serviceState;
    @OneToMany(mappedBy = "service")
    private Set<Period> weeklyOpenPeriods;
    @OneToMany
    @JoinTable(
        name="service_photo",
        joinColumns = @JoinColumn(name="service_id"),
        inverseJoinColumns = @JoinColumn(name="photo_id")
    )
    private Set<Photo> photos;
    @OneToOne
    private Location location;
    private double rating;
    private int totalUserRatings;

    @OneToMany
    @JoinTable(
        name="service_review",
        joinColumns = @JoinColumn(name="service_id"),
        inverseJoinColumns = @JoinColumn(name="review_id")
    )
    private Set<Review> reviews;
}
