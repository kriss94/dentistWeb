package com.kklaczek.dentist_web_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InformationDto {

    private Long id;
    private Integer number;
    private String eMail;
    private String description;
}
