package com.spring.clinic.springclinic.services.map;


import com.spring.clinic.springclinic.model.PetType;
import com.spring.clinic.springclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    public Set<PetType> findAll() {
        return super.findAll();
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public void delete(PetType object) {
        super.delete(object);
    }

    public PetType save(PetType object) {
        return super.save(object);
    }

    public PetType findById(Long id) {
        return super.findById(id);
    }
}
