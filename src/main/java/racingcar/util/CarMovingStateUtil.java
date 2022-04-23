package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.enums.CarMovingStateEnum;

public class CarMovingStateUtil {
    public CarMovingStateEnum judgeMovingState() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            return CarMovingStateEnum.MOVE;
        }

        return CarMovingStateEnum.STOP;
    }
}
