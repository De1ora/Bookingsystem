package com.example.bookingsystemAPI.repository;

import com.example.bookingsystemAPI.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
