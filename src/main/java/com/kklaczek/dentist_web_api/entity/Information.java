package com.kklaczek.dentist_web_api.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
public class Information {

    @Id
    @GeneratedValue
    private Long id;

    private Integer number;
    private String eMail;
    private String description;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentalOffice_id")
    @ToString.Exclude
    private DentalOffice dentalOffice;


}
