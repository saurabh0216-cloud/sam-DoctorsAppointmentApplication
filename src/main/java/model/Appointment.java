package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
    public class Appointment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDateTime appointmentTime;

        @ManyToOne
        @JoinColumn(name = "doctor_id")
        private Doctor doctor;

        @ManyToOne
        @JoinColumn(name = "patient_id")
        private Patient patient;

        private String status; // Scheduled, Completed, Cancelled

    public Appointment(Long id, LocalDateTime appointmentTime, Doctor doctor, Patient patient, String status) {
        this.id = id;
        this.appointmentTime = appointmentTime;
        this.doctor = doctor;
        this.patient = patient;
        this.status = status;
    }
}


