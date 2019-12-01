package com.summaryofbooks.backend.application;

import com.summaryofbooks.backend.domain.Book;
import com.summaryofbooks.backend.infrastructure.BookEntity;
import com.summaryofbooks.backend.infrastructure.BookRespository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private static Logger logger = LogManager.getLogger(BookService.class);
    private BookRespository bookRespository;

    @Autowired
    public BookService(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public List<Book> getAllBooks() {
        try {
            List<BookEntity> bookEntities = bookRespository.findAll();
            logger.info("Successfully fetched books form DB");
            return bookEntities.stream().map(book -> new Book(
                    book.getTitle(),
                    book.getAuthor(),
                    book.getImage(),
                    book.getSummary())).collect(Collectors.toList());
        } catch (Exception e) {
            logger.error(e.getMessage());
           return Collections.emptyList();
        }
    }

    public void addBook(Book book) {
        try {
            bookRespository.save(new BookEntity(book.getTitle(), book.getAuthor(), book.getImage(), book.getSummary()));
            logger.info("Successfully saved book to DB");
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
