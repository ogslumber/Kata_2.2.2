package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = List.of(
                new Car("Volkswagen", "Golf", 120),
                new Car("Audi", "Quattro", 240),
                new Car("Mitsubishi", "Delica", 120),
                new Car("Toyota", "Soarer", 190),
                new Car("Lada", "Granta", 180)
        );
    }

    @Override
    public List<Car> get(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public List<Car> get() {
        return cars;
    }
}
