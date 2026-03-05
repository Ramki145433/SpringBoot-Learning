package com.example.learningSpringBoot.Dto;

import com.example.learningSpringBoot.Entity.Book;

public class BookDto {
    Integer id;
    String bookName;

    public Integer getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Integer getPrice() {
        return price;
    }

    String bookAuthor;
    Integer price;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BookDto BookMapper(Book book) {
        this.setId(book.getId());
        this.setBookName(book.getBookName());
        this.setBookAuthor(book.getBookAuthor());
        this.setPrice(book.getPrice());
        return this;
    }
}