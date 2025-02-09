package ge.guka.springbootdemo.cars;

import ge.guka.springbootdemo.cars.model.Car;
import ge.guka.springbootdemo.cars.model.Engine;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    @PostConstruct
    void setup() {
        cars.add(new Car("Dodge Challanger V6", 2020, true, new Engine(300, 3.5)));
        cars.add(new Car("Jeep Wrangler", 2024, true, new Engine(250, 4.5)));
        cars.add(new Car("BMW i13", 2073, true, new Engine(700, 2.5)));
        cars.add(new Car("Toyota Prius 2050", 2050, false, new Engine(500, 5.5)));
    }

    public List<Car> getCars() {
        return cars;
    }
}
