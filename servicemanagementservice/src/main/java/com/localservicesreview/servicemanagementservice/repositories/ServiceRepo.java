package com.localservicesreview.servicemanagementservice.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.localservicesreview.servicemanagementservice.models.Service;

@Repository
public interface ServiceRepo extends JpaRepository<Service, UUID> {

}
