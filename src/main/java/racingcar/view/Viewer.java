package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Viewer {
    private static final String ERROR_PREFIX = "[ERROR] ";
    public String inputCarNames() {
        System.out.println(InputText.CAR_NAME.getText());
        return Console.readLine();
    }

    public String inputAttemptCount() {
        System.out.println(InputText.NUMBER_OF_ATTEMPTS.getText());
        return Console.readLine();
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(ERROR_PREFIX + errorMessage);
    }
}
