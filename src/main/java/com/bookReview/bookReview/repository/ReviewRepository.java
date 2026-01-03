package com.bookReview.bookReview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookReview.bookReview.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
