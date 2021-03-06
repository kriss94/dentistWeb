package com.kklaczek.dentist_web_api.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentalOffice_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private DentalOffice dentalOffice;
}

