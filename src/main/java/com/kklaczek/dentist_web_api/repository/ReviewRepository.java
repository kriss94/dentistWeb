package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews, Long> {
}
