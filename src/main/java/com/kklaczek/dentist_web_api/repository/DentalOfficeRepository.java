package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.DentalOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentalOfficeRepository extends JpaRepository<DentalOffice, Long> {
}
