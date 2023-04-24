package com.example.mayaanimalclinic.repositories;

import com.example.mayaanimalclinic.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
