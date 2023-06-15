package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private int carsCount;
    private List <Car> carList;
    {carList = new ArrayList<>();
    carList.add(new Car(++carsCount, "Porshe",911));
    carList.add(new Car(++carsCount, "VAZ",2109));
    carList.add(new Car(++carsCount, "GAZ",3110));
    carList.add(new Car(++carsCount, "BMW",725));
    carList.add(new Car(++carsCount, "Moskhich",412));
    }
    @Override
    public List<Car> showCars() {
        return carList;
    }

    @Override
    public List<Car> showSomeCars(int count) {
        return count <5 ? showCars().subList(0,count):showCars();
    }
}
