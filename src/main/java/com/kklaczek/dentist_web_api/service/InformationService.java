package com.kklaczek.dentist_web_api.service;

import com.kklaczek.dentist_web_api.dto.InformationDto;

public interface InformationService {
    InformationDto save(InformationDto informationDto);
    InformationDto findById(Long id);
    InformationDto edit(Long id, InformationDto informationDto);
    InformationDto delete(Long id);
}
