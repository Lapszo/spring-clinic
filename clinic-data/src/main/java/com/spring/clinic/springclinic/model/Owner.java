package com.spring.clinic.springclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


public class Owner extends Person {

    private Set<Pet> pets = new HashSet<>();

    public Owner() {
    }

    public Owner(Set<Pet> pets) {
        this.pets = pets;
    }
    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

}
