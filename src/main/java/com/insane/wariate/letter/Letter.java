package com.insane.wariate.letter;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

public record Letter(
    Integer id,
    @NotEmpty
    String sender,
    @NotEmpty
    String recipient,
    @NotEmpty
    String message,
    LocalDateTime sentAt
) {}