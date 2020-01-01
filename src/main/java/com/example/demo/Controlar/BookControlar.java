package com.example.demo.Controlar;

import com.example.demo.Repository.BookRepository;
import com.example.demo.model.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.Bookservice;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BookControlar {
    @Autowired
    Bookservice bookservice;
    @Autowired
    BookRepository bookRepository;

    @GetMapping("book")
    public List<book> getAll(){
       return bookservice.getAll();
    }

    @PostMapping("book")
        public String save(@RequestBody book book){
            bookRepository.save(book);
            return "success";
    }

    @GetMapping("bookbyid")
    public book getById(@RequestParam Long id){
                return bookRepository.findById(id).get();
        }

    @GetMapping("bookbyname/{name}")
    public book getByName(@PathVariable String name){
            return bookRepository.findByName(name);
        }

}


