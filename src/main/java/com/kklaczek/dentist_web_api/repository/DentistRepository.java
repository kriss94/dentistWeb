package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DentistRepository extends JpaRepository<Dentist, Long> {

    List<Dentist> findAllBySpecialtiesAndDentalOffice_Address_City(List<String> specialities, String city);
}
