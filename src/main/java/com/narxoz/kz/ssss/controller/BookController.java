package com.narxoz.kz.ssss.controller;
import com.narxoz.kz.ssss.model.Book;
import com.narxoz.kz.ssss.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("book")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}