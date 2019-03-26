package com.kklaczek.dentist_web_api.service;

import com.kklaczek.dentist_web_api.dto.AddressDto;

import java.util.List;

public interface AddressService {
    AddressDto save(AddressDto addressDto);
    AddressDto findById(Long id);
    AddressDto edit(Long id, AddressDto addressDto);
    AddressDto delete(Long id);
}
