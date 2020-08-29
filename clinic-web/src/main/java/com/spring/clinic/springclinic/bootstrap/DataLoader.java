package com.spring.clinic.springclinic.bootstrap;

import com.spring.clinic.springclinic.model.*;
import com.spring.clinic.springclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService,
                      PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType catPetType = new PetType();
        catPetType.setName("Cat");

        PetType petType1 = petTypeService.save(catPetType);

        PetType dogPetType = new PetType();
        dogPetType.setName("Dog");

        PetType petType2 = petTypeService.save(dogPetType);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");

        specialityService.save(surgery);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(petType2);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(petType1);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        Visit visitCat = new Visit();
        visitCat.setPet(fionasCat);
        visitCat.setDate(LocalDate.now());
        visitCat.setDescription("derp");

        visitService.save(visitCat);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(surgery);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(radiology);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
