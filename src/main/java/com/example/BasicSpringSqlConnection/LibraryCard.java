package com.example.BasicSpringSqlConnection;

import jakarta.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    /* We should define 3 things

    1.What's the relation between two Entity
    2.What is the column you want to join.
    3.to whom (which Entity) to join /connect

    */

    @Enumerated(value = EnumType.STRING)   //To store the values in db in String format
    private CardStatus cardStatus;

    // Child class will have the foreign key of the parent class : through which it connects to the other tables.

    @OneToOne // mapping the relation between two Entity.
    @JoinColumn  //You are telling : add a foreign key column ---> define the column name of the parent class, by default its the primary key of parent classs.
    User user;  //With whom(entity) to connect.
}
