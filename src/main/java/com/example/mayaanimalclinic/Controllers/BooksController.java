package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.repositories.BookRepo;
import com.example.mayaanimalclinic.repositories.PublisherRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BooksController(BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @RequestMapping("/books")
        public String getBooks(Model model){

        model.addAttribute("books", bookRepo.findAll());
        model.addAttribute("publishers",publisherRepo.findAll());

        return "list";
    }


}
