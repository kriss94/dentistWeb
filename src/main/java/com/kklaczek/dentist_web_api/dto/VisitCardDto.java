package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Dentist;
import com.kklaczek.dentist_web_api.entity.Patient;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VisitCardDto {

    private Long id;
    private LocalDateTime date;
    private BigDecimal cost;
    private String description;
    private List<String> prescriptions;
    private PatientDto patient;
    private DentistDto dentist;
}
