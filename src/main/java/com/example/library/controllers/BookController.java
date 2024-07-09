package com.example.library.controllers;

import com.example.library.models.Book;
import com.example.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();

    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {

        return bookService.addBook(book);

    }

}
