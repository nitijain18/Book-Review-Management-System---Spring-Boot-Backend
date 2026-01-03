package com.bookReview.bookReview.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String author;
    private String genre;
    private String publishedDate;

    //if a book is removed from database , even review is removed - orphanRemoval
    @OneToMany(mappedBy ="book" , cascade=CascadeType.ALL , orphanRemoval=true)
    private List<Review> reviews;

}
