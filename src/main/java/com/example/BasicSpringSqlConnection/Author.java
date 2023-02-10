package com.example.BasicSpringSqlConnection;

import jakarta.persistence.*;

@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //id parameter will be auto generated in a counting
    //User doest need to send it from postman
    private int id;

    private String name;

    private int booksWritten;


    private String country;

    private int age;

    public Author() {
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

    public int getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(int booksWritten) {
        this.booksWritten = booksWritten;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
