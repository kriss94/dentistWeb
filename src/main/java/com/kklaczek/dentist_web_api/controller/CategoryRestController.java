package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.CategoryDto;
import com.kklaczek.dentist_web_api.entity.Category;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryRestController extends AbstractCrudRestController<Category, CategoryDto> {


}
