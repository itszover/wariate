package com.insane.wariate.letter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class LetterRepository {

    private static final Logger log = LoggerFactory.getLogger(LetterRepository.class);
    private final JdbcClient jdbcClient;

    public LetterRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
    // private List<Letter> letters = new ArrayList<>();

    // List<Letter> findAll() {
    //     return letters;
    // }

    // Optional<Letter> findById(int id) {
    //     return letters.stream()
    //             .filter(letter -> letter.id() == id)
    //             .findFirst();
    // }

    // void create(Letter letter) {
    //     letters.add(letter);
    // }

    // void update(Letter letter) {
    //     Optional<Letter> existingLetter = findById(letter.id());

    //     if (existingLetter.isPresent()) {
    //         letters.set(letters.indexOf(existingLetter.get()), letter);    
    //     }
    // }

    // void delete(Integer id) {
    //     letters.removeIf(letters -> letters.id().equals(id));
    // }

    // @PostConstruct
    // private void init() {
    //     letters.add(new Letter(
    //             1,
    //             "Alice",
    //             "Bob",
    //             "Hello, Bob!",
    //             LocalDateTime.now()));

    //     letters.add(new Letter(
    //             2,
    //             "Bob",
    //             "Alice",
    //             "Hi, Alice!",
    //             LocalDateTime.now()));
    // }
}
