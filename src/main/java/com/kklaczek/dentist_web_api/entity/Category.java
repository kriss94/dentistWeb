package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "dentalOffice_id")
    private DentalOffice dentalOffice;
}
