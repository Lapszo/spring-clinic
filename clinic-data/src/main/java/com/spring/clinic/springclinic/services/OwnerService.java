package com.spring.clinic.springclinic.services;

import com.spring.clinic.springclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
