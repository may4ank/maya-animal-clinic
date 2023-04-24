package com.example.mayaanimalclinic.repositories;

import com.example.mayaanimalclinic.Domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Books, Long> {
}
