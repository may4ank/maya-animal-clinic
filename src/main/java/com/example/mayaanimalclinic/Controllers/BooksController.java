package com.example.mayaanimalclinic.Controllers;

import com.example.mayaanimalclinic.repositories.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

    private final BookRepo bookRepo;

    public BooksController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/books")
        public String getBooks(Model model){

        model.addAttribute("books", bookRepo.findAll());

        return "list";
    }


}
