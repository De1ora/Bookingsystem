package com.example.bookingsystemAPI.service;

import com.example.bookingsystemAPI.model.Booking;
import com.example.bookingsystemAPI.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImplementation implements BookingService {

    @Autowired
    private BookingRepository repository;

    @Override
    public List<Booking> getAllBookings() {
        return repository.findAll();
    }

    @Override
    public Optional<Booking> getBookingById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Booking createBooking(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Booking updateBooking(Long id, Booking updatedBooking) {
        if (repository.existsById(id)) {
            updatedBooking.setId(id);
            return repository.save(updatedBooking);
        }
        return null;
    }

    @Override
    public boolean deleteBooking(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}