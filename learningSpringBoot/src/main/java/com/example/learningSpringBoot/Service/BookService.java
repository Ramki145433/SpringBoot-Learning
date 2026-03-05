package com.example.learningSpringBoot.Service;

import com.example.learningSpringBoot.Dto.BookDto;
import com.example.learningSpringBoot.Entity.Book;
import com.example.learningSpringBoot.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository bookRepository;

    // setter injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookDto getBook(Integer id){
        Book book = bookRepository.getBook(id);
        BookDto bookDto = new BookDto();
        System.out.println(bookDto.BookMapper(book));
        return bookDto.BookMapper(book);
    }
}
