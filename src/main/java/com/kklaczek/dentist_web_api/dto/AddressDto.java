package com.kklaczek.dentist_web_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressDto {
    private Long id;
    private String city;
    private String postCode;
    private String street;
    private String houseNumber;
}
