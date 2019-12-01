package com.summaryofbooks.backend.api;

import com.summaryofbooks.backend.application.BookService;
import com.summaryofbooks.backend.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookApi {

    private BookService bookService;

    @Autowired
    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(path = "/books", method = RequestMethod.POST)
    public HttpStatus addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return HttpStatus.OK;
    }

}
