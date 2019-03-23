package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
