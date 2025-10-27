package racingcar.domain;

import java.util.List;

public class Race {

    private final List<Car> cars;

    public Race(List<Car> cars) {
        validateCars(cars);
        this.cars = cars;
    }

    private void validateCars(List<Car> cars) {
        long distinctCount = cars.stream()
                .map(Car::getName)
                .distinct()
                .count();
        if(distinctCount != cars.size()) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }

    public void moveAll(int randomNumber) {
        for(Car car : cars) {
            car.move(randomNumber);
        }
    }

    public List<String> findWinners() {
        int maxLocation = findMaxLocation();

        return cars.stream()
                .filter(car -> car.isMaxLocation(maxLocation))
                .map(Car::getName)
                .toList();
    }

    private int findMaxLocation() {
        return cars.stream()
                .mapToInt(Car::getLocation)
                .max()
                .orElse(0);
    }

    public List<Car> getCars() {
        return cars;
    }
}
