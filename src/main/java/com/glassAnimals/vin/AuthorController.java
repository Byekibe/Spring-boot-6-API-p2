package com.glassAnimals.vin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAllAuthors() {
        return  authorRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        if (author.getName() == null || author.getName().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        Author savedAuthor = authorRepository.save(author);
        return ResponseEntity.ok(savedAuthor);
    }
}
