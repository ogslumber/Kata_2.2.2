package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> get(int count);
    List<Car> get();
}
