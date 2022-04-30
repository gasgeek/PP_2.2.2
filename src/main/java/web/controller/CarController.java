package web.controller;


import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

   CarService carService;
   public CarController(CarService carService) {
       this.carService = carService;
   }

   @GetMapping("/cars")
    public String getCarPage (@RequestParam(value = "count", required = false) Integer count, @NonNull Model model) {
       model.addAttribute("carList", carService.getCarList(count));
       return "cars";
   }

}
