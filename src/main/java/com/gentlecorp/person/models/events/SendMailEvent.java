package com.gentlecorp.person.models.events;

import com.gentlecorp.person.models.entities.Person;

import java.util.UUID;

public record SendMailEvent(
    String email,
    UUID id,
    String firstName,
    String lastName,
    String roles
) {
    public static SendMailEvent fromEntity(final Person person, final String role) {
        return new SendMailEvent(
            person.getEmail(),
            person.getId(),
            person.getFirstName(),
            person.getLastName(),
            role
        );
    }
}
