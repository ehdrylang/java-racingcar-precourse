package racingcar.controller;

import racingcar.model.AttemptCount;
import racingcar.model.CarCollection;
import racingcar.model.CarNames;
import racingcar.view.Viewer;

public class RacingGame {
    private final Viewer viewer;

    public RacingGame() {
        this.viewer = new Viewer();
    }
    public void start() {
        createRacingCars();
        String attemptCount = viewer.inputAttemptCount();
        AttemptCount count = new AttemptCount(attemptCount);

    }
    private CarCollection createRacingCars() {
        String carNames = viewer.inputCarNames();
        CarNames names = new CarNames(carNames);
        return new CarCollection(names);
    }
}
