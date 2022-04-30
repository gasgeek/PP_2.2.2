package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Gaz", "Lastochka", 1.6d));
        carList.add(new Car("Beha", "Restyling", 4.6d));
        carList.add(new Car("Lada", "Zubilo", 1.8d));
        carList.add(new Car("VW", "TransporterT5", 1.9d));
        carList.add(new Car("GrandCherokee", "Hemi", 5.7d));
    }

    public List<Car> getCarList(Integer count) {
        if(count !=null && count >= 0 && count <= this.carList.size()) {
            return this.carList.subList(0, count);
        }
        return this.carList;
    }

}
