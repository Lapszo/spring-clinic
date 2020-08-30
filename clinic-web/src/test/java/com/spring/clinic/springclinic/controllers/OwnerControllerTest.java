package com.spring.clinic.springclinic.controllers;

import com.spring.clinic.springclinic.services.OwnerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    private final OwnerController ownerController = new OwnerController(ownerService);


    @Test
    void AddReturnTrueAndCrateObjectOwnerController(){
    }
}
