package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.InformationDto;
import com.kklaczek.dentist_web_api.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/information")
public class InformationRestController {

    private final InformationService informationService;

    @GetMapping("/add")
    public ResponseEntity<InformationDto> save(@RequestBody InformationDto informationDto){
        return new ResponseEntity<>(informationService.save(informationDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InformationDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(informationService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InformationDto> edit(@PathVariable Long id, @RequestBody InformationDto informationDto){
        return new ResponseEntity<>(informationService.edit(id, informationDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InformationDto> delete(@PathVariable Long id){
        return new ResponseEntity<>(informationService.delete(id), HttpStatus.OK);
    }
}
