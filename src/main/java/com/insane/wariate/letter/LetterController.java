package com.insane.wariate.letter;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/letters")
public class LetterController {

    private final LetterRepository letterRepository;

    public LetterController(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }

    @GetMapping("")
    List<Letter> findAll() {
        return letterRepository.findAll();
    }

    @GetMapping("/{id}")
    Letter findById(@PathVariable Integer id) {

        Optional<Letter> letter = letterRepository.findById(id);

        if (letter.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        return letter.get();
    }
}
