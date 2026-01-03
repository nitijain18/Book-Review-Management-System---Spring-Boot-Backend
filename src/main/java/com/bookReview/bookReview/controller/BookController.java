package com.bookReview.bookReview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookReview.bookReview.model.Book;
import com.bookReview.bookReview.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //add book
    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        return ResponseEntity.ok(bookService.createBook(book));
    }

    @GetMapping("/books")
   public ResponseEntity<List<Book>> getAllBooks(){
    return ResponseEntity.ok(bookService.getAllBooks());
   }

   @GetMapping("/books/{id}")
   public ResponseEntity<Book> getBookById(@PathVariable int id){
    return ResponseEntity.ok(bookService.getBookById(id));
   }

   @DeleteMapping("/books/{id}")
   public ResponseEntity<String> deleteBook(@PathVariable int id){
    bookService.deleteBook(id);
    return ResponseEntity.ok("book deleted");
   }
}
