package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.AttemptCount;
import racingcar.model.CarCollection;
import racingcar.model.CarNames;
import racingcar.view.Viewer;

public class RacingGame {
    private static final int MIN = 0;
    private static final int MAX = 9;
    private final Viewer viewer;
    private CarCollection racingCars;

    public RacingGame() {
        this.viewer = new Viewer();
    }

    public void start() {
        racingCars = createRacingCars();
        AttemptCount count = getAttemptCount();
        for (int i = 0; i < count.getCount(); i++) {
            race(racingCars.getCarCount());
        }

    }

    private AttemptCount getAttemptCount() {
        String attemptCount = viewer.inputAttemptCount();
        return new AttemptCount(attemptCount);
    }

    private void race(int carCount) {
        for (int i = 0; i < carCount; i++) {
            move(i);
        }
    }

    private void move(int i) {
        if (canMove()) {
            racingCars.go(i);
            return;
        }
        racingCars.stop(i);
    }

    private boolean canMove() {
        return Randoms.pickNumberInRange(MIN, MAX) >= 4;
    }

    private CarCollection createRacingCars() {
        String carNames = viewer.inputCarNames();
        CarNames names = new CarNames(carNames);
        return new CarCollection(names);
    }

}
