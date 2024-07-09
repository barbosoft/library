package com.example.library.services;

import com.example.library.models.Book;
import com.example.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {

        return bookRepository.findAll();

    }

    public Book addBook(Book book) {

                return bookRepository.save(book);

    }

}
