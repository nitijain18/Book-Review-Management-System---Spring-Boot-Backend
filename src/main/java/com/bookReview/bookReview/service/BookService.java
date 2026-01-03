package com.bookReview.bookReview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookReview.bookReview.model.Book;
import com.bookReview.bookReview.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.findById(id).
        orElseThrow(() -> new RuntimeException("book not found"));
    }

    public void deleteBook(int id){
        bookRepository.deleteById(id);
    }
}
