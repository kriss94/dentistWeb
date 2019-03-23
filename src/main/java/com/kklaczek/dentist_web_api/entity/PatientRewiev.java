package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PatientRewiev {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
