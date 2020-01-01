package com.example.demo.service;

import com.example.demo.Repository.BookRepository;
import com.example.demo.model.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bookservice {
    @Autowired
    BookRepository bookRepository;

    Bookservice(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public List<book> getAll(){
        return bookRepository.findAll();
    }
}
