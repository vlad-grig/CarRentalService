package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BranchMVCController {

    private final BranchService branchService;

    @Autowired
    public BranchMVCController(BranchService branchService) {
        this.branchService = branchService;
    }


}
