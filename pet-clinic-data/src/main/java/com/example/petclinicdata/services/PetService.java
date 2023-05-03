package com.example.petclinicdata.services;

import com.example.petclinicdata.Model.Owner;
import com.example.petclinicdata.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
