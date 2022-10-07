package racingcar.model;

public class Car {
    private final String name;

    public Car(String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        if (isBlank(name)) {
            return false;
        }
        if (!isValidNameLength(name)) {
            return false;
        }
        if (containsWhiteSpaceBeforeAndAfter(name)) {
            return false;
        }
        return true;
    }

    private boolean containsWhiteSpaceBeforeAndAfter(String name) {
        return name.length() != name.trim().length();
    }

    private boolean isBlank(String name) {
        return name == null || name.isEmpty() || name.trim().isEmpty();
    }

    private boolean isValidNameLength(String name) {
        return name.length() >= 1 && name.length() <= 5;
    }

    public String getName() {
        return name;
    }
}
