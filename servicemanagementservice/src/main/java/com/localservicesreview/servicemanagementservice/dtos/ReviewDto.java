package com.localservicesreview.servicemanagementservice.dtos;

import java.util.UUID;
import com.localservicesreview.servicemanagementservice.models.AttachmentTypeEnum;
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
    AttachmentTypeEnum attachmentTypeEnum;
    String attachmentUrl;
    Long likes;
    Long dislikes;


}
