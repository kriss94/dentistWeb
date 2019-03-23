package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
