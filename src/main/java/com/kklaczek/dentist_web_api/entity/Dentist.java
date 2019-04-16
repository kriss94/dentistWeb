package com.kklaczek.dentist_web_api.entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

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

    @OneToMany(mappedBy = "dentist")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Review> reviews;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> specialties;

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

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

    public Set<String> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<String> specialties) {
        this.specialties = specialties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dentist)) return false;
        if (!super.equals(o)) return false;
        Dentist dentist = (Dentist) o;
        return description.equals(dentist.description) &&
                degree.equals(dentist.degree) &&
                dentalOffice.equals(dentist.dentalOffice) &&
                visitCards.equals(dentist.visitCards) &&
                specialties.equals(dentist.specialties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, degree, dentalOffice, visitCards, specialties);
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "description='" + description + '\'' +
                ", degree='" + degree + '\'' +
                ", dentalOffice=" + dentalOffice +
                ", visitCards=" + visitCards +
                ", specialties=" + specialties +
                "} " + super.toString();
    }
}
