package com.spring.clinic.springclinic.services;

import com.spring.clinic.springclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
