package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private static List<Car> cars = new ArrayList<>(Arrays.asList
            (new Car(1L, "Bmv", "red"),
                    new Car(2L, "Hyundai", "black"),
                    new Car(4L, "Reno", "blue"),
                    new Car(3L, "Honda", "red"),
                    new Car(5L, "Porshe", "green")));
    @Override
    public List<Car> showCars(int count) {
        return cars.subList(0, count);
    }
}