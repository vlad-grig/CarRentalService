package com.sda.carrentalservice.service;

import com.sda.carrentalservice.dto.BranchDTO;
import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {

    private final BranchRepository branchRepository;

    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public List<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    public void deleteBranchById(Long id) {
        branchRepository.deleteById(id);
    }

    public Branch findBranchById(Long id) {
        Optional<Branch> optionalBranch = branchRepository.findById(id);
        if (optionalBranch.isPresent()) {
            Branch branch = optionalBranch.get();
            return branch;
        } else {
            throw new RuntimeException();
        }
    }

    public Long countBranches() {
        return branchRepository.count();
    }
}
