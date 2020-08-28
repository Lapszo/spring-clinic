package com.spring.clinic.springclinic.repositories;

import com.spring.clinic.springclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
