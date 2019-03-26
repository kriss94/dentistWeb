package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.DentalOffice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    private DentalOffice dentalOffice;
}
