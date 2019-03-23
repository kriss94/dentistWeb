package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String postCode;
    private String street;
    private String houseNumber;
}
