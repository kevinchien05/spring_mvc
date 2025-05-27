package com.example.catalog.service;

import java.util.List;

import com.example.catalog.form.BookForm;
import com.example.catalog.model.Book;

public interface BookService {
    public List<Book> findAllBook();

    public void addBook(BookForm bookForm);
}
