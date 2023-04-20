package racingcar;

public class Car {
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private String name;
    private int position;

    public Car(String name) {
        if( isInvalidCarName(name) ) {
            throw new InvalidCarNameException();
        }
        this.name = name;
    }

    private boolean isInvalidCarName(String name) {
        return name.length() > CAR_NAME_MAX_LENGTH;
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        this.position += 1;
    }

    public int getPosition() {
        return position;
    }
}
