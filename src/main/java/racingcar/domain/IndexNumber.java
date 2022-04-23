package racingcar.domain;

public class IndexNumber {
    private int indexNumber;

    public IndexNumber() {
        indexNumber = 0;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void increaseIndex() {
        indexNumber += 1;
    }
}
