package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.DentistDto;
import com.kklaczek.dentist_web_api.entity.Dentist;
import com.kklaczek.dentist_web_api.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/dentists")
    public ResponseEntity<List<DentistDto>> findDentistBySpecialtiesAndCity(List<String> specialties, String city){
        return new ResponseEntity<>(searchService.findDentistBySpecialtiesAndCity(specialties, city), HttpStatus.OK);
    }


}
