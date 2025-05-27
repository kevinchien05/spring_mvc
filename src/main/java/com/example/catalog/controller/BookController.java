package com.example.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.catalog.form.BookForm;
import com.example.catalog.model.Book;
import com.example.catalog.service.BookService;



@Controller
@RequestMapping("/book")
public class BookController {
    
    private final BookService bookService;
    private List<Book> books;

    @Autowired
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String bookList(Model model){
        books = bookService.findAllBook();
        model.addAttribute("books", books);
        return "book/book-list";
    }
 
    @GetMapping("/form")
    public String bookForm(Model model) {
        model.addAttribute("bookForm", new BookForm());
        return "book/book-form";
    }

    @PostMapping("/new")
    public String addNewBook(@ModelAttribute BookForm bookForm, Model model){
        bookService.addBook(bookForm);
        return "redirect:/book/list";
    }
    
}
