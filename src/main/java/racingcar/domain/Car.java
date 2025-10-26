package racingcar.domain;

public class Car {

    private static final int MOVE_CONDITION = 4;

    private final String name;
    private int location = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자 이내여야 합니다.");
        }
    }

    public void move(int randomNumber) {
        if (randomNumber >= MOVE_CONDITION) {
            location++;
        }
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public boolean isMaxLocation(int max) {
        return this.location == max;
    }
}
