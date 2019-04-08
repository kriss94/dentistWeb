package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.PatientReviewDto;
import com.kklaczek.dentist_web_api.entity.PatientReview;
import com.kklaczek.dentist_web_api.service.PatientRewievService;
import org.springframework.stereotype.Service;

@Service
public class PatientReviewServiceImpl extends AbstractCrudService<PatientReview, PatientReviewDto> implements PatientRewievService {
}
