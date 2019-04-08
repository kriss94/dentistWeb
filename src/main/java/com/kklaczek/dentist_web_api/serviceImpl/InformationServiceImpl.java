package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.InformationDto;
import com.kklaczek.dentist_web_api.entity.Information;
import com.kklaczek.dentist_web_api.service.InformationService;
import org.springframework.stereotype.Service;

@Service
public class InformationServiceImpl extends AbstractCrudService<Information, InformationDto> implements InformationService {


}
