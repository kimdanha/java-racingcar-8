package racingcar.controller;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarNameParser {

    public static List<Car> parse(String inputNames) {
        String[] splitNames = inputNames.split(",");
        List<Car> cars = new ArrayList<>();

        for(String name: splitNames) {
            String carName = name.trim();
            cars.add(new Car(carName));
        }

        return cars;
    }
}
