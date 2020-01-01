package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;

    @ManyToOne
    private Author author;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public book(){

    }

public book(Long id,String name,Double price){
   this.id=id;
   this.name=name;
   this.price=price;
}
}