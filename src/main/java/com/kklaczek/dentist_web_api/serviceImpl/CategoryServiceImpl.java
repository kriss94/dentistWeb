package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.CategoryDto;
import com.kklaczek.dentist_web_api.entity.Category;
import com.kklaczek.dentist_web_api.repository.CategoryRepository;
import com.kklaczek.dentist_web_api.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        return modelMapper.map(categoryRepository.save(category), CategoryDto.class);
    }

    @Override
    public CategoryDto findById(Long id) {
       Category category = categoryRepository.findById(id).orElseThrow(NullPointerException::new);
       return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public CategoryDto edit(Long id, CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        category.setId(id);
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public CategoryDto delete(Long id) {
        CategoryDto categoryDto = modelMapper.map(categoryRepository.findById(id).orElseThrow(NullPointerException::new), CategoryDto.class);
        categoryRepository.deleteById(id);
        return categoryDto;
    }

}
