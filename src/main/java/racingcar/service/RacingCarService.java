package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.constants.OptionConstants;
import racingcar.domain.Car;
import racingcar.domain.CarNamesInput;
import racingcar.domain.Cars;

public class RacingCarService {

    private Cars cars;

    public void initService(CarNamesInput carNamesInput) {
        String[] nameArray = carNamesInput.getNames().split(OptionConstants.CAR_NAME_SPLIT_REGEX);
        List<Car> carList = new ArrayList<>();

        for (String name : nameArray) {
            carList.add(new Car(name));
        }

        cars = new Cars(carList);
    }

}
