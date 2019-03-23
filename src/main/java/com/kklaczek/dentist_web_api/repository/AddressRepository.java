package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
