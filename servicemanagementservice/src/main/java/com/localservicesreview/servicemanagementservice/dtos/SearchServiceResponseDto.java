package com.localservicesreview.servicemanagementservice.dtos;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchServiceResponseDto {
    private int totalCount;
    private Set<GetServiceResponseDto> services;

}
