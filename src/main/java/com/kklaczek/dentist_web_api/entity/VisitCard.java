package com.kklaczek.dentist_web_api.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "visit_cards")
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
    @Column(name = "prescription")
    private List<String> prescriptions;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "patient_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Patient patient;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentist_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Dentist dentist;
}
