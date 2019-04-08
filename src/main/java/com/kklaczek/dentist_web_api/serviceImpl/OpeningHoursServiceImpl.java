package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.OpeningHoursDto;
import com.kklaczek.dentist_web_api.entity.OpeningHours;
import com.kklaczek.dentist_web_api.service.OpeningHoursService;
import org.springframework.stereotype.Service;

@Service
public class OpeningHoursServiceImpl extends AbstractCrudService<OpeningHours, OpeningHoursDto> implements OpeningHoursService {
}
