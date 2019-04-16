package com.kklaczek.dentist_web_api.service;

import com.kklaczek.dentist_web_api.dto.DentistDto;
import com.kklaczek.dentist_web_api.entity.Dentist;

import java.util.List;

public interface SearchService {

    List<DentistDto> findDentistBySpecialtiesAndCity(List<String> specialties, String city);
}
