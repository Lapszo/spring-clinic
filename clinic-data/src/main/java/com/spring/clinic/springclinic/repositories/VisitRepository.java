package com.spring.clinic.springclinic.repositories;

import com.spring.clinic.springclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
