package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.DentistDto;
import com.kklaczek.dentist_web_api.entity.Dentist;
import com.kklaczek.dentist_web_api.service.DentistService;
import org.springframework.stereotype.Service;

@Service
public class DentistServiceImpl extends AbstractCrudService<Dentist, DentistDto> implements DentistService {
}
