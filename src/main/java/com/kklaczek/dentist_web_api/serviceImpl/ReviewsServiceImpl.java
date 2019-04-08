package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.ReviewsDto;
import com.kklaczek.dentist_web_api.entity.Review;
import com.kklaczek.dentist_web_api.service.ReviewsService;
import org.springframework.stereotype.Service;

@Service
public class ReviewsServiceImpl extends AbstractCrudService<Review, ReviewsDto> implements ReviewsService {
}
