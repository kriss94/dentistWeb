package com.kklaczek.dentist_web_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReviewsDto {

    private Long id;
    private Integer rate;
    private String description;
    private LocalDateTime time;
}
