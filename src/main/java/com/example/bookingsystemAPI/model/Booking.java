package com.example.bookingsystemAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Databasen sköter ID automatiskt
    private Long id;

    private String name;
    private String email;
    private LocalDateTime dateTime;
    private Integer numberOfPeople;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;
}