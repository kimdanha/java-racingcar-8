package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Race;

public class RacingGameService {

    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 9;

    public void oneRound(Race cars) {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN, RANDOM_MAX);
        cars.moveAll(randomNumber);
    }
}
