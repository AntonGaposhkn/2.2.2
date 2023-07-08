package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
public class CarsController {

    @Autowired
    private CarService carService;
    
    @GetMapping("/cars")
    public String showCarsByCount(@RequestParam(value = "count", defaultValue = "5") int count, Model model) throws Exception {

        if (count > 5 || count <= 0) {
            count = 5;
        }

        List<Car> carList = carService.showCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}