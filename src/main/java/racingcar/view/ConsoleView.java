package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constants.MessageConstants;
import racingcar.domain.CarNamesInput;

public class ConsoleView {
    public CarNamesInput readCarNamesInput() {
        System.out.println(MessageConstants.CONSOLE_MESSAGE_CAR_NAMES);

        String inputValue = Console.readLine();
        return new CarNamesInput(inputValue);
    }
}
