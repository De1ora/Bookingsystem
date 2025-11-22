package com.example.bookingsystemAPI.service;

import com.example.bookingsystemAPI.exception.ResourceNotFoundException;
import com.example.bookingsystemAPI.model.Booking;
import com.example.bookingsystemAPI.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImplementation implements BookingService {

    private final BookingRepository repository;

    @Override
    public List<Booking> getAllBookings() {
        return repository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));
    }

    @Override
    public Booking createBooking(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Booking updateBooking(Long id, Booking updatedBooking) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Booking not found with id: " + id);
        }
        updatedBooking.setId(id);
        return repository.save(updatedBooking);
    }

    @Override
    public void deleteBooking(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Booking not found with id: " + id);
        }
        repository.deleteById(id);
    }
}