package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.InformationDto;
import com.kklaczek.dentist_web_api.entity.Information;
import com.kklaczek.dentist_web_api.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/information")
public class InformationRestController extends AbstractCrudRestController<Information, InformationDto> {

}
