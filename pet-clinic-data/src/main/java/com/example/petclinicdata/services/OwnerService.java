package com.example.petclinicdata.services;

import com.example.petclinicdata.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
