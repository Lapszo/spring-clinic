package com.spring.clinic.springclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    @Column(name = "name")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    @Column(name = "owner")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    @Column(name = "visit_id")
    private Set<Vet> visits = new HashSet<>();

    public Pet() {
    }

    public Pet(String name, PetType petType, Owner owner, LocalDate birthDate, Set<Vet> visits) {
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Vet> getVisits() {
        return visits;
    }

    public void setVisits(Set<Vet> visits) {
        this.visits = visits;
    }
}
