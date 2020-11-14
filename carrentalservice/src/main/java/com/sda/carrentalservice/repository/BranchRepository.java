package com.sda.carrentalservice.repository;

import com.sda.carrentalservice.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
