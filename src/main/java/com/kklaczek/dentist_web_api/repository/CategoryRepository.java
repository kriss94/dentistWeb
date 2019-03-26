package com.kklaczek.dentist_web_api.repository;

import com.kklaczek.dentist_web_api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
