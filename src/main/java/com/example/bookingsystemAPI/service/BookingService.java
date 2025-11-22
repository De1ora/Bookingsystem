package com.example.bookingsystemAPI.service;

import com.example.bookingsystemAPI.model.Booking;

import java.util.List;

public interface BookingService {

    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    Booking createBooking(Booking booking);

    Booking updateBooking(Long id, Booking updatedBooking);

    void deleteBooking(Long id);
}