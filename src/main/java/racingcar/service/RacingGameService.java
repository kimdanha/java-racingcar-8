package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Race;

public class RacingGameService {

    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;

    public void oneRound(Race cars) {
        for (Car car : cars.getCars()) {
            int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);
            car.move(randomNumber);
        }
    }
}
