package com.localservicesreview.servicemanagementservice.dtos;

import java.util.UUID;
import com.localservicesreview.servicemanagementservice.models.AttacthmentTypeEnum;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewDto {
    UUID id;
    UUID userId;
    UUID serviceId;
    Integer stars;
    String text;
    String useful;
    String funny;
    String cool;
    AttacthmentTypeEnum attacthmentTypeEnum;
    String attachmentUrl;

}
