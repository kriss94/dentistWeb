package com.kklaczek.dentist_web_api.dto;

import com.kklaczek.dentist_web_api.entity.Address;
import com.kklaczek.dentist_web_api.entity.type.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {

    private Long id;
    private String login;
    private String password;
    private LocalDateTime creationDate;
    private String name;
    private String surname;
    private Role role;
    private String eMail;
    private AddressDto address;
}
