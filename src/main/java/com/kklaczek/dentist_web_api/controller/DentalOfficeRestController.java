package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.DentalOfficeDto;
import com.kklaczek.dentist_web_api.service.DentalOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dentalOffice")
public class DentalOfficeRestController {

    private final DentalOfficeService dentalOfficeService;

    @GetMapping("/add")
    public ResponseEntity<DentalOfficeDto> save(@RequestBody DentalOfficeDto dentalOfficeDto){
        return new ResponseEntity<>(dentalOfficeService.save(dentalOfficeDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DentalOfficeDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(dentalOfficeService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DentalOfficeDto> edit(@PathVariable Long id, @RequestBody DentalOfficeDto dentalOfficeDto){
        return new ResponseEntity<>(dentalOfficeService.edit(id, dentalOfficeDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DentalOfficeDto> delete(@PathVariable Long id){
        return new ResponseEntity<>(dentalOfficeService.delete(id), HttpStatus.OK);
    }
}
