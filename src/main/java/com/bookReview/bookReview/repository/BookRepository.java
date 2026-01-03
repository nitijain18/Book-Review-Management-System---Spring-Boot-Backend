package com.bookReview.bookReview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookReview.bookReview.model.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{

}
