package com.example.demo.car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public List<Car> getCars() {
        return List.of(
                new Car(
                        "Porsche",
                        "GT4",
                        "GT Silver",
                        1400.45,
                        2,
                        3
                )
        );
    }
}
