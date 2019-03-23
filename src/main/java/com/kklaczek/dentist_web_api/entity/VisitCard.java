package com.kklaczek.dentist_web_api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class VisitCard {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime date;
    private BigDecimal cost;
    private String description;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "prescriptions", joinColumns = @JoinColumn(name = "visitCard_id", referencedColumnName = "id"))
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<String> prescriptions;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;
}
