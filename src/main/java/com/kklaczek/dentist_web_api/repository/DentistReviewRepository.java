package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.DentistReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistReviewRepository extends JpaRepository<DentistReview, Long> {
}
