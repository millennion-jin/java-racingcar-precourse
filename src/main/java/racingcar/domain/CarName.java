package racingcar.domain;

import racingcar.constants.OptionConstants;

public class CarName {
    private final String name;

    public CarName(String name) {
        validateCarName(name);
        this.name = name;
    }

    private void validateCarName(String name) {
        validateNullOrEmpty(name);
        validateLength(name);
    }

    private void validateNullOrEmpty(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("AAA");
        }
    }

    private void validateLength(String name) {
        if (name.length() > OptionConstants.CAR_NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException("BBB");
        }
    }

    public String getName() {
        return name;
    }
}
