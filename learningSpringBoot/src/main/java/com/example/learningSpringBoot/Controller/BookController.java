package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Dto.BookDto;
import com.example.learningSpringBoot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/getBook/{id}")
    public ResponseEntity<BookDto> getBook(@PathVariable Integer id) {
        BookDto book = bookService.getBook(id);
        return ResponseEntity.ok(book);
    }
}
