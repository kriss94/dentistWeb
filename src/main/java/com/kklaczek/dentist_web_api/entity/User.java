package com.kklaczek.dentist_web_api.entity;

import com.kklaczek.dentist_web_api.entity.type.Role;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String login;
    private String password;
    private LocalDateTime creationDate;
    private String name;
    private String surname;
    private Role role;
    private String eMail;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address address;
}
