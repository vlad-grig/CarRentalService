package com.sda.carrentalservice.service;

import com.sda.carrentalservice.entity.Branch;
import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.exception.NotFoundException;
import com.sda.carrentalservice.repository.BranchRepository;
import com.sda.carrentalservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final BranchRepository branchRepository;

    @Autowired
    public CarService(CarRepository carRepository, BranchRepository branchRepository){
        this.carRepository = carRepository;
        this.branchRepository = branchRepository;
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    public Car findCarById(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            return optionalCar.get();
        } else {
            throw new NotFoundException("Car with id " + id + " does not exist.");
        }
    }
    public void deleteCarById(Long id) {
        Car carById = this.findCarById(id);
        Branch branch = carById.getBranch();
        branch.getCars().remove(carById);
        branchRepository.save(branch);
        carRepository.deleteById(id);
    }

    public Long countCars() {
        return carRepository.count();
    }
}
