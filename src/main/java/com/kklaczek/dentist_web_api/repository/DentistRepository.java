package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
