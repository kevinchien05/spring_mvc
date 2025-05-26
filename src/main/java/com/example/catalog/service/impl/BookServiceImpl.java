package com.example.catalog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.catalog.model.Book;
import com.example.catalog.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> findAllBook() {
        Book book1 = new Book();
        book1.setId("1");
        book1.setName("AC");
        book1.setAuthor("Budi");
        book1.setDescription("Testing");
        Book book2 = new Book();
        book2.setId("2");
        book2.setName("AC2");
        book2.setAuthor("Budi2");
        book2.setDescription("Testing2");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }

}
