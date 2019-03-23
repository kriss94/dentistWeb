package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
