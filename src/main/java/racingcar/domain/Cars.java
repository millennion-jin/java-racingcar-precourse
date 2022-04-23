package racingcar.domain;

import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        validateNullOrEmpty(carList);
        this.carList = carList;
    }

    private void validateNullOrEmpty(List<Car> carList) {
        if(carList == null || carList.isEmpty()) {
            throw new IllegalArgumentException("CCC");
        }
    }

    public int size() {
        return carList.size();
    }

    public Car get(IndexNumber index) {
        return carList.get(index.getIndexNumber());
    }
}
