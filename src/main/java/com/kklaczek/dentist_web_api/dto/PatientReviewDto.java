package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientReviewDto {

    private Long id;
    private PatientDto patient;
}
