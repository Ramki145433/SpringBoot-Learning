package com.example.learningSpringBoot.Entity;

public class Book {
    Integer id;
    String bookName;
    String bookAuthor;
    Integer price;

    public Book() {

    }
    public Book(Integer id, String bookName, String bookAuthor, Integer price){
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
