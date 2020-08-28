package com.spring.clinic.springclinic.repositories;

import com.spring.clinic.springclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
