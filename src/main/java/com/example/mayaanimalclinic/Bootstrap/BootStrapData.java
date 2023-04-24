package com.example.mayaanimalclinic.Bootstrap;

import com.example.mayaanimalclinic.Domain.Author;
import com.example.mayaanimalclinic.Domain.Books;
import com.example.mayaanimalclinic.Domain.Publisher;
import com.example.mayaanimalclinic.repositories.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.mayaanimalclinic.repositories.AuthorRepo;
import com.example.mayaanimalclinic.repositories.BookRepo;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher p1 = new Publisher("rony baba");
        publisherRepo.save(p1);
        Author a1 = new Author("Mayank", "71 Bank Colony");
        Books b1 = new Books("mainframe", 12, p1);

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        p1.getBooks().add(b1);
      //  b1.setPublisher(p1);


        authorRepo.save(a1);
        bookRepo.save(b1);
        publisherRepo.save(p1);



        System.out.println("number of books "+ bookRepo.count());
        System.out.println("number of Authors "+ authorRepo.count());
        System.out.println("number of Publisher"+ publisherRepo.count());


    }
}
