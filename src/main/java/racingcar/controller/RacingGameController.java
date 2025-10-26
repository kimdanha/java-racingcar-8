package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Race;
import racingcar.service.RacingGameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingGameController {

    private final RacingGameService racingGameService = new RacingGameService();

    public void run() {
        String inputNames = InputView.inputCarNames();
        List<Car> carList = CarNameParser.parse(inputNames);
        Race cars = new Race(carList);

        int tryCount = InputView.inputTryCount();

        OutputView.printResultTitle();

        for(int i = 0; i < tryCount; i++) {
            racingGameService.oneRound(cars);
            OutputView.printEachRound(cars.getCars());
        }

        OutputView.printWinners(cars.findWinners());
    }
}
