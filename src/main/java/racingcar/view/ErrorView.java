package racingcar.view;

import racingcar.constants.MessageConstants;

public class ErrorView {
    private void printErrorMessage(IllegalArgumentException exception) {
        System.out.printf((MessageConstants.ERROR_MESSAGE_BASE) + "%n", exception.getMessage());
    }
}
