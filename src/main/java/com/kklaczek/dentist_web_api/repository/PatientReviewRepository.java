package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.PatientReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReviewRepository extends JpaRepository<PatientReview, Long> {
}
