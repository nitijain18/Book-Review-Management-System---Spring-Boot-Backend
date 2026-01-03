package com.bookReview.bookReview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookReview.bookReview.model.Review;
import com.bookReview.bookReview.service.ReviewService;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/book/{bookId}")
    public ResponseEntity<Review>addReview(@PathVariable int bookId,@RequestBody Review review){
        Review savedReview = reviewService.addReview(bookId , review);
        return ResponseEntity.ok(savedReview);
    }

}
