package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.PatientDto;
import com.kklaczek.dentist_web_api.entity.Patient;
import com.kklaczek.dentist_web_api.service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends AbstractCrudService<Patient, PatientDto> implements PatientService {
}
