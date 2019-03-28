package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
