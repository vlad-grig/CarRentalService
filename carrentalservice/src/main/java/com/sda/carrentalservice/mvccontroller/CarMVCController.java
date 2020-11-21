package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.dto.CarDTO;
import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CarMVCController {

    private final CarService carService;

    @Autowired
    public CarMVCController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(path = "/cars")
    public String showCars(Model model){
        model.addAttribute("cars", this.carService.findAllCar());
        return "index";
    }

    @PostMapping(path = "viewAddCar")
    public String viewAddCar(Model model){
        model.addAttribute("car", new Car());
        return "add-car";
    }

    @PostMapping(path = "/car/add")
    public String addCar(@ModelAttribute("car") @Valid Car car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-car";
        } else {
            this.carService.saveCar(car);
            return "redirect:/";
        }
    }

    @GetMapping(path = "/car/delete/{id}")
    public String deleteCarById(@PathVariable("id") Long id){
        this.carService.deleteCarById(id);
        return "redirect:/";
    }

    @PostMapping(path = "/car/update")
    public String editCar(@ModelAttribute("car") @Valid Car car, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "edit-car";
        }
        this.carService.saveCar(car);
        return "redirect:/";
    }
}
