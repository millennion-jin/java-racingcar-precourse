package racingcar.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarNamesInput;

class RacingCarServiceTest {
    private static final String TEST_VALUE_NORMAL = "mars,earth,moon,pluto";
    private static final String TEST_VALUE_EMPTY_ONE = "mars,earth, ,pluto";

    @Test
    void 자동차명_입력시_빈값_존재() {
        CarNamesInput input = new CarNamesInput(TEST_VALUE_EMPTY_ONE);
        RacingCarService service = new RacingCarService();

        assertThatThrownBy(() -> service.initService(input))
                .isInstanceOf(IllegalArgumentException.class);

    }
}