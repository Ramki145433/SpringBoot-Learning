package com.example.learningSpringBoot.Repository;
import com.example.learningSpringBoot.Entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public Book getBook(Integer id) {
        return new Book(id, "Sherlock Holmes", "Sherlock", 999);
    }
}
