package com.insane.wariate.letter;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

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
            throw new LetterNotFoundException();
        }
        
        return letter.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody Letter letter) {
        letterRepository.create(letter);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("")
    void update(@Valid @RequestBody Letter letter) {
        letterRepository.update(letter);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        letterRepository.delete(id);
    }
}
