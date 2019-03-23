package com.kklaczek.dentist_web_api.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Reviews {

    @Id
    @GeneratedValue
    private Long id;

    private Float rate;
    private String description;
    private LocalDateTime time;


}
