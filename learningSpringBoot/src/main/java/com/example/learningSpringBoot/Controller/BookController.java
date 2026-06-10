package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Components.Engine;
import com.example.learningSpringBoot.Dto.BookDto;
import com.example.learningSpringBoot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    Engine engine;
    public BookController(Engine engine) {
        this.engine = engine;
        engine.start();
    }

    @Autowired
    BookService bookService;
//    final BookService bookService;//Field 'bookService' might not have been initialized

    @GetMapping("/getBook/{id}")
    public ResponseEntity<BookDto> getBook(@PathVariable Integer id) {
        BookDto book = bookService.getBook(id);
        return ResponseEntity.ok(book);
    }

//    static void main() {
//        BookController bookController = new BookController();
//        // This will through null pointer exception
//        System.out.println(bookController.bookService.getBook(1));
//    }
}
