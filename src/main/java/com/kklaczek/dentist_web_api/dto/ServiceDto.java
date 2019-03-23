package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Category;
import com.kklaczek.dentist_web_api.entity.type.Contraindications;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ServiceDto {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Contraindications contraindications;
    private Category category;
}
