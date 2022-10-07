package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Viewer {
    public String inputCarNames() {
        System.out.println(InputText.CAR_NAME.getText());
        return Console.readLine();
    }
}
