package com.example.petclinicdata.services;

import com.example.petclinicdata.Model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
