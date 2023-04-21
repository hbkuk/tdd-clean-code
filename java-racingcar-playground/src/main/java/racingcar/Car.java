package racingcar;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public Car(String name) {
        if( isInValidNameLength(name) ) {
            throw new IllegalArgumentException("차의 이름을 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    private boolean isInValidNameLength(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }
    public String getName() {
        return name;
    }
}
