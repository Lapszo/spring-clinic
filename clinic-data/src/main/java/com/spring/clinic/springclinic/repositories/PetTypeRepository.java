package com.spring.clinic.springclinic.repositories;

import com.spring.clinic.springclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
