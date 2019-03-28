package com.kklaczek.dentist_web_api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "dentists")
public class Dentist extends User {

    private String description;
    private String degree;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dentalOffice_id")
    private DentalOffice dentalOffice;

    @OneToMany(mappedBy = "patient")
    private Set<VisitCard> visitCards;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public DentalOffice getDentalOffice() {
        return dentalOffice;
    }

    public void setDentalOffice(DentalOffice dentalOffice) {
        this.dentalOffice = dentalOffice;
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
        if (!(o instanceof Dentist)) return false;
        if (!super.equals(o)) return false;
        Dentist dentist = (Dentist) o;
        return Objects.equals(description, dentist.description) &&
                Objects.equals(degree, dentist.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, degree);
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "description='" + description + '\'' +
                ", degree='" + degree + '\'' +
                "} " + super.toString();
    }
}
