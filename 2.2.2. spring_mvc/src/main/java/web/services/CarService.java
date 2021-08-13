package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private static final List<Car> carList;

    static {
        carList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            carList.add(new Car("Tesla", i, "черный"));
        }
    }


    public List<Car> getCarList(int count) {
        if (count <= 0) {
            return null;
        }

        if (count > 5) {
            return carList;
        }

        return carList.stream()
                        .limit(count)
                        .collect(Collectors.toList());
    }


}
