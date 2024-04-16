package com.insane.wariate.letter;

import java.time.LocalDateTime;

public record Letter(
    Integer id,
    String sender,
    String recipient,
    String message,
    LocalDateTime sentAt
) {}