package com.insane.wariate.letter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LetterNotFoundException extends RuntimeException{
    public LetterNotFoundException() {
        super("Letter not found");
    }
}
