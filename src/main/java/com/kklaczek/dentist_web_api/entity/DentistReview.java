package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DentistReview {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;
}
