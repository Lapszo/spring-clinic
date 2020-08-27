package com.spring.clinic.springclinic.services.map;

import com.spring.clinic.springclinic.model.Speciality;
import com.spring.clinic.springclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    public Set<Speciality> findAll() {
        return super.findAll();
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }


    public void delete(Speciality object) {
        super.delete(object);
    }


    public Speciality save(Speciality object) {
        return super.save(object);
    }


    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
