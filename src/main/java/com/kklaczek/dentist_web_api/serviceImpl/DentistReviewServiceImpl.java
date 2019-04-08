package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.DentistReviewDto;
import com.kklaczek.dentist_web_api.entity.DentistReview;
import com.kklaczek.dentist_web_api.service.DentistReviewService;
import org.springframework.stereotype.Service;

@Service
public class DentistReviewServiceImpl extends AbstractCrudService<DentistReview, DentistReviewDto> implements DentistReviewService {
}
