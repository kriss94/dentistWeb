package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Dentist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DentistReviewDto {

    private Long id;
    private Dentist dentist;
}
