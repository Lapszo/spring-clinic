package com.spring.clinic.springclinic.bootstrap;

import com.spring.clinic.springclinic.model.Owner;
import com.spring.clinic.springclinic.model.Pet;
import com.spring.clinic.springclinic.model.PetType;
import com.spring.clinic.springclinic.model.Vet;
import com.spring.clinic.springclinic.services.OwnerService;
import com.spring.clinic.springclinic.services.PetService;
import com.spring.clinic.springclinic.services.VetService;
import com.spring.clinic.springclinic.services.map.OwnerServiceMap;
import com.spring.clinic.springclinic.services.map.PetServiceMap;
import com.spring.clinic.springclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType catPetType = new PetType();
        catPetType.setName("Cat");

        PetType dogPetType = new PetType();
        dogPetType.setName("Dog");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(dogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        ownerService.save(owner1);

        petService.save(mikesPet);

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
        fionasCat.setPetType(dogPetType);

        ownerService.save(owner2);

        petService.save(fionasCat);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
