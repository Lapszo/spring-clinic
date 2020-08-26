package com.spring.clinic.springclinic.services;

import com.spring.clinic.springclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
