package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars;

    public Race(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> findWinners() {
        int maxLocation = findMaxLocation();

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isMaxLocation(maxLocation)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private int findMaxLocation() {
        int max = 0;
        for (Car car : cars) {
            if (car.getLocation() > max) {
                max = car.getLocation();
            }
        }
        return max;
    }

    public List<Car> getCars() {
        return cars;
    }
}
