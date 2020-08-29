package com.spring.clinic.springclinic.services.impl;

import com.spring.clinic.springclinic.model.Visit;
import com.spring.clinic.springclinic.repositories.VisitRepository;
import com.spring.clinic.springclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VisitServiceImpl implements VisitService {

    private final VisitRepository vetRepository;

    public VisitServiceImpl(VisitRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Visit findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
