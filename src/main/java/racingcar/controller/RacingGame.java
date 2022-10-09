package racingcar.controller;

import racingcar.model.CarCollection;
import racingcar.model.CarNames;
import racingcar.view.Viewer;

public class RacingGame {
    private Viewer viewer;

    public RacingGame() {
        this.viewer = new Viewer();
    }
    public void start() {
        createRacingCars();
    }
    private CarCollection createRacingCars() {
        String carNames = viewer.inputCarNames();
        CarNames names = new CarNames(carNames);
        return new CarCollection(names);
    }
}
