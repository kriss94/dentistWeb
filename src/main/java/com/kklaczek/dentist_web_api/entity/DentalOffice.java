package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DentalOffice {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "information_id")
    private Information information;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address address;
}
