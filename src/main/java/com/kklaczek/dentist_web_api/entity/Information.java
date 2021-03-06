package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Information {

    @Id
    @GeneratedValue
    private Long id;

    private Integer number;
    private String eMail;
    private String description;


}
