package com.insane.wariate.letter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class LetterRepository {

    private List<Letter> letters = new ArrayList<>();

    List<Letter> findAll() {
        return letters;
    }

    Optional<Letter> findById(int id) {
        return letters.stream()
                .filter(letter -> letter.id() == id)
                .findFirst();
    }

    void create(Letter letter) {
        letters.add(letter);
    }

    @PostConstruct
    private void init() {
        letters.add(new Letter(
                1,
                "Alice",
                "Bob",
                "Hello, Bob!",
                LocalDateTime.now()));

        letters.add(new Letter(
                2,
                "Bob",
                "Alice",
                "Hi, Alice!",
                LocalDateTime.now()));
    }
}
