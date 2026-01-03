package com.bookReview.bookReview.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookReview.bookReview.model.Book;
import com.bookReview.bookReview.model.Review;
import com.bookReview.bookReview.repository.BookRepository;
import com.bookReview.bookReview.repository.ReviewRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private BookRepository bookRepository;

    //add review
    public Review addReview(int bookId, Review review){
        Book book = bookRepository.findById(bookId).
        orElseThrow(()-> new RuntimeException("book id not found"));

        review.setBook(book);
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }
    
   
}
