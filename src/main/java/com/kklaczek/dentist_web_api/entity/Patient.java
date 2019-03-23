package com.kklaczek.dentist_web_api.entity;

import javassist.runtime.Inner;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private Integer pesel;

}
