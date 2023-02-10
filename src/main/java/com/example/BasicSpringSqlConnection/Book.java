package com.example.BasicSpringSqlConnection;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //id parameter will be auto generated in a counting
    //User doest need to send it from postman
    private int id;
    private String name;
    private  int pages;

    //Connect with the author class
    @ManyToOne  //--> in annotation     @ManyToOne => @ [Many] t0 [One]  : 1st [] represents Current class(Book) ,and 2nd [] represents other class(author in this case)
    @JoinColumn
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
