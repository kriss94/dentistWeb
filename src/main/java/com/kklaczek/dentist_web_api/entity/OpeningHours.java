package com.kklaczek.dentist_web_api.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Data
public class OpeningHours {

    @Id
    @GeneratedValue
    private Long id;

    private DayOfWeek dayOfWeek;
    private LocalTime openingTime;
    private LocalTime closingTime;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "information_id")
    @ToString.Exclude
    private Information information;
}
