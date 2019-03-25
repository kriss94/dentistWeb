package com.kklaczek.dentist_web_api.service;

import com.kklaczek.dentist_web_api.dto.DentalOfficeDto;

public interface DentalOfficeService {
    DentalOfficeDto save(DentalOfficeDto dentalOfficeDto);
    DentalOfficeDto findById(Long id);
    DentalOfficeDto edit(Long id, DentalOfficeDto dentalOfficeDto);
    DentalOfficeDto delete(Long id);
}
