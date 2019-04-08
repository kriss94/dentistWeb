package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.VisitCardDto;
import com.kklaczek.dentist_web_api.entity.VisitCard;
import com.kklaczek.dentist_web_api.service.VisitCardService;
import org.springframework.stereotype.Service;

@Service
public class VisitCardServiceImpl extends AbstractCrudService<VisitCard, VisitCardDto> implements VisitCardService {
}
