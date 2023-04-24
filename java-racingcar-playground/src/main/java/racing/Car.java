package racing;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int MAX_NAME_LENGTH_VALUE = 5;
    private static final int MIN_FORWARD_NUMBER = 4;
    private String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        if( isInvalidNameLength(name) ) {
            throw new IllegalArgumentException("자동차의 이름이 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
        this.position = position;
    }

    private boolean isInvalidNameLength(String name) {
        return name.length() > MAX_NAME_LENGTH_VALUE;
    }
    
    public void move(MovingStrategy movingStrategy) {
        if( movingStrategy.movable() ) {
            this.position += 1;
        }
    }

    public void move(int number) {
        if( isMove(number) ) {
            this.position += 1;
        }
    }

    private boolean isMove(int number) {
        return number >= MIN_FORWARD_NUMBER;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(name, other.name) && position == other.position;
    }

}
