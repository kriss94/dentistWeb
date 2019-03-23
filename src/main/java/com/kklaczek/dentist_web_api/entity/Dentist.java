package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Dentist {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private String degree;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentalOffice_id")
    private DentalOffice dentalOffice;



}
