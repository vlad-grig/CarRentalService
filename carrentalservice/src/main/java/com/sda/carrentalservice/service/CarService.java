package com.sda.carrentalservice.service;

import com.sda.carrentalservice.entity.Car;
import com.sda.carrentalservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAllCar() {
        return carRepository.findAll();
    }

    public Car findCarById(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            return optionalCar.get();
        } else {
            throw new RuntimeException();
        }
    }
    public void deleteCarById(Long id) {
        this.findCarById(id);
        carRepository.deleteById(id);
    }
}
