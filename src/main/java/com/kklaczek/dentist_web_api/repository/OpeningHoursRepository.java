package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.OpeningHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpeningHoursRepository extends JpaRepository<OpeningHours, Long> {
}
