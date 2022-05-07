package com.narxoz.kz.ssss.model;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String title;

    private String author;

    private String category;

    private int year;

    @ManyToOne
    private User owner;
}