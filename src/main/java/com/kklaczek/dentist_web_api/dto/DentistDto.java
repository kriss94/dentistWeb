package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.DentalOffice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DentistDto {

    private Long id;
    private String description;
    private String degree;
    private DentalOfficeDto dentalOffice;
    private Set<VisitCardDto> visitCardDtos;
    private Set<ReviewsDto> reviewsDtos;

}
