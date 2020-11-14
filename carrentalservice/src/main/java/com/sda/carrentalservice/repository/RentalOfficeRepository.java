package com.sda.carrentalservice.repository;

import com.sda.carrentalservice.entity.RentalOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalOfficeRepository extends JpaRepository<RentalOffice, Long> {
}
