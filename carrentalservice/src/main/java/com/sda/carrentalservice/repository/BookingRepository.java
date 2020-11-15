package com.sda.carrentalservice.repository;

import com.sda.carrentalservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
