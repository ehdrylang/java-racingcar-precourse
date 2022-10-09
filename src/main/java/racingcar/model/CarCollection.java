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
    public void go(int index) {
        if (!isValidIndex(index)) {
            return;
        }
        Car car = cars.get(index);
        car.go();
    }
    public void stop(int index) {
        if (!isValidIndex(index)) {
            return;
        }
        Car car = cars.get(index);
        car.stop();
    }
    public int getCarCount() {
        return this.cars.size();
    }
    private boolean isValidIndex(int index) {
        return index >= 0 && index < cars.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : this.cars) {
            sb.append(car);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
