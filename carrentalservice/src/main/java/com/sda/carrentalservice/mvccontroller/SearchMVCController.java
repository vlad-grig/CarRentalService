package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchMVCController {

    private final CarService carService;

    @Autowired
    public SearchMVCController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "/")
    public String search(String searchString, Model model) {
        model.addAttribute("cars", this.carService.findCarByName(searchString));
        return "car-list";
    }
}
