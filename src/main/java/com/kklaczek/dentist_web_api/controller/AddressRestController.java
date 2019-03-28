package com.kklaczek.dentist_web_api.controller;

import com.kklaczek.dentist_web_api.dto.AddressDto;
import com.kklaczek.dentist_web_api.entity.Address;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressRestController extends AbstractCrudRestController<Address, AddressDto> {

}
