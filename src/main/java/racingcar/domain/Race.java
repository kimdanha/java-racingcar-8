package racingcar.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Race {

    private final List<Car> cars;

    public Race(List<Car> cars) {
        validateCars(cars);
        this.cars = cars;
    }

    private void validateCars(List<Car> cars) {
        Set<String> names = new HashSet<>();
        for(Car car : cars) {
            if(!names.add(car.getName())) {
                throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
            }
        }
    }

    public void moveAll(int randomNumber) {
        for(Car car : cars) {
            car.move(randomNumber);
        }
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
