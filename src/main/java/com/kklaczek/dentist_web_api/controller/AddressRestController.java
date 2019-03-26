package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.AddressDto;
import com.kklaczek.dentist_web_api.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressRestController {

    private final AddressService addressService;

    @GetMapping("/add")
    public ResponseEntity<AddressDto> save(@RequestBody AddressDto addressDto){
        return new ResponseEntity<>(addressService.save(addressDto), HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AddressDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(addressService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<AddressDto> edit(@PathVariable Long id, @RequestBody AddressDto addressDto){
        return new ResponseEntity<>(addressService.edit(id, addressDto), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<AddressDto> delete(@PathVariable Long id){
        return new ResponseEntity<>(addressService.delete(id), HttpStatus.OK);
    }
}
