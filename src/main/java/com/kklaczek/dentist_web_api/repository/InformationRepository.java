package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, Long> {
}
