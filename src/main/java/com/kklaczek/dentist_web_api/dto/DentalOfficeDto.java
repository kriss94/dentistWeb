package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Address;
import com.kklaczek.dentist_web_api.entity.Information;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DentalOfficeDto {

    private Long id;
    private String name;
    private InformationDto information;
    private AddressDto address;
}
