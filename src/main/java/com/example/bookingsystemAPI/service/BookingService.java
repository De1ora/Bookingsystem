package com.example.bookingsystemAPI.service;

import com.example.bookingsystemAPI.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository repository; // till repository

    // Metoder för att hämta alla bokningar, hämta en bokning, skapa ny bokning, uppdatera bokning
    // ta bort bokning ...
}