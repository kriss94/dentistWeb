package com.kklaczek.dentist_web_api.service;

import com.kklaczek.dentist_web_api.dto.CategoryDto;
import com.kklaczek.dentist_web_api.dto.CategoryDto;

public interface CategoryService {

    CategoryDto save(CategoryDto categoryDto);
    CategoryDto findById(Long id);
    CategoryDto edit(Long id, CategoryDto categoryDto);
    CategoryDto delete(Long id);
}

