package com.example.BasicSpringSqlConnection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //So that hibernate can identitfiy whose attribute to pick up for a table creation.
@Table(name="user_info")    //This is just for the given Table name, bydefault : tablename == classname
public class User {
    @Id    // It is wriiten on the attribute which has to become primary key.
    private int id;   //It is the primary key in table
    private String name;
    private  int age;

    private int mobileNumber;

    @Column(name = "country_name")  //by this we can modify attributes and column name in sql table will be different from attribute name in Entity
    private String country;

    @Column(unique = true)  //So our data in sql table will remain unique,it is to avoid duplicate value
    private String email;


    //Always create the default constructor
    public User(){
    }

    //Good practice is to create all args constructor
    public User(int id, String name, int age, int mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
