package com.sda.carrentalservice.mvccontroller;

import com.sda.carrentalservice.entity.Rental;
import com.sda.carrentalservice.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RentalMVCController {

    public final RentalService rentalService;

    @Autowired
    public RentalMVCController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping(path = "/rentals")
    public String showRentals(Model model) {
        model.addAttribute("rental", this.rentalService.findAllRentals());
        model.addAttribute("rentalNumber", this.rentalService.countRental());
        return "rental-list";
    }

    @GetMapping(path = "/rental/delete/{id}")
    public String deleteRentalById(@PathVariable("id") Long id) {
        rentalService.deleteRentalById(id);
        return "redirect:/rentals";
    }

    @PostMapping(path = "/rental/add")
    public String addRental(@ModelAttribute("rental") @Valid Rental rental, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-rental";
        } else {
            this.rentalService.saveRental(rental);
            return "redirect:/rentals";
        }
    }

    @GetMapping(path = "/rental/registration")
    public String showRegistrationPage(Model model) {
        model.addAttribute("rental", new Rental());
        return "add-rental";
    }

    @PostMapping(path = "/rental/update")
    public String editRental(@ModelAttribute("rental") @Valid Rental rental, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-rental";
        } else {
            this.rentalService.saveRental(rental);
            return "redirect:/rentals";
        }
    }

    @GetMapping(path = "/rental/edit/{id}")
    public String showUpdatePage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("rental", this.rentalService.findRentalById(id));
        return "edit-rental";
    }
}
