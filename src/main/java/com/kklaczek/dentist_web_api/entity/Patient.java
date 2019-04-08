package com.kklaczek.dentist_web_api.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient extends User {

    private Integer pesel;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "patient")
    private Set<VisitCard> visitCards;

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<VisitCard> getVisitCards() {
        return visitCards;
    }

    public void setVisitCards(Set<VisitCard> visitCards) {
        this.visitCards = visitCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(pesel, patient.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pesel);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pesel=" + pesel +
                "} " + super.toString();
    }
}
