package com.kklaczek.dentist_web_api.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String postCode;
    private String street;
    private String houseNumber;

    @OneToMany(mappedBy = "address", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Patient> patients;

    @OneToMany(mappedBy = "address", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<DentalOffice> dentalOffices;
}
