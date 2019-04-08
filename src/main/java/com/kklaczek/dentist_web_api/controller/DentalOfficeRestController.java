package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.DentalOfficeDto;
import com.kklaczek.dentist_web_api.entity.DentalOffice;
import com.kklaczek.dentist_web_api.service.DentalOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentalOffice")
public class DentalOfficeRestController extends AbstractCrudRestController<DentalOffice, DentalOfficeDto> {


}
