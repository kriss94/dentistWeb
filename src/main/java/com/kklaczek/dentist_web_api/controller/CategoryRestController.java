package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.CategoryDto;
import com.kklaczek.dentist_web_api.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryRestController {

    private final CategoryService categoryService;

    @GetMapping("/add")
    public ResponseEntity<CategoryDto> save(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(categoryService.save(categoryDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> edit(@PathVariable Long id, @RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(categoryService.edit(id, categoryDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryDto> delete(@PathVariable Long id){
        return new ResponseEntity<>(categoryService.delete(id), HttpStatus.OK);
    }
}
