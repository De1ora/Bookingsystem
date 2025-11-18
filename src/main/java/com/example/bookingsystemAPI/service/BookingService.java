package com.example.bookingsystemAPI.service;

import com.example.bookingsystemAPI.model.Booking;
import com.example.bookingsystemAPI.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository repository;

    public List<Booking> getAllBookings() {
        return repository.findAll(); // // Repository gör SQL: SELECT * FROM bookings, alltså hämtar alla!
    }

    public Optional<Booking> getBookingById(Long id) { // Optional eftersom bokningen kanske inte finns!
        return repository.findById(id); // SQL: SELECT * FROM bookings WHERE id =
    }

    public Booking createBooking(Booking booking) {
        return repository.save(booking);
    }

    public Booking updateBooking(Long id, Booking updatedBooking) {
        if (repository.existsById(id)) {
            updatedBooking.setId(id);
            return repository.save(updatedBooking);
        }
        return null;
    }

    public boolean deleteBooking(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id); // SQL: DELETE FROM bookings WHERE id =
            return true;
        }
        return false;
    }
}