package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    private List<Car> cars;

    public CarCollection(CarNames carNames) {
        if (carNames == null) {
            throw new IllegalArgumentException();
        }
        this.cars = new ArrayList<>();
        for (String carName : carNames.getCarNames()) {
            cars.add(new Car(carName));
        }
    }
}
