package com.senai.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibraryController {
    
    @GetMapping("/libraries")
    public String findLibrary(){
        return "Teste";
    }

    @PostMapping("/books")
    public String createLibrary(){
        return "Criado";
    }

    @DeleteMapping("/books/{id}")
    public String deleteBooks(@PathVariable int id){
        return "Deletado";
    }

    @PatchMapping("/books/{id}")
    public String changeBook(@PathVariable int id){
        return "Book has been changed";
    }

    @PutMapping("/books/{id}")
    public String changeBookObject(@PathVariable int id){
        return "Object has been changes";
    }


}