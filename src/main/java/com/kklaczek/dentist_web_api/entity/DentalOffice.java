package com.kklaczek.dentist_web_api.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "dental_offices")
public class DentalOffice {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "information_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Information information;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Address address;

    @OneToMany(mappedBy = "dentalOffice")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Review> reviews;
}
