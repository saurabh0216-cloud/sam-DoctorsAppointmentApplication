package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Patient {
    @Id
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Patient(long id, String name, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
}

