package com.localservicesreview.servicemanagementservice.dtos;

import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadPhotoResponseDto {
    private UUID serviceId;
    private Set<Photo> photos;

    private class Photo{
        private UUID photoId;
        private String url;
    }
}

