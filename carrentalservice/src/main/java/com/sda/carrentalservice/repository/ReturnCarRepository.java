package com.sda.carrentalservice.repository;

import com.sda.carrentalservice.entity.ReturnCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnCarRepository extends JpaRepository<ReturnCar, Long> {
}
