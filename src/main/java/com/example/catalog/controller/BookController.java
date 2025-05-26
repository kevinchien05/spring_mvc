package com.example.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.catalog.model.Book;
import com.example.catalog.service.BookService;


@Controller
@RequestMapping("/book")
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Book> books = bookService.findAllBook();
        model.addAttribute("books", books);
        return "book/book-list";
    }
}
