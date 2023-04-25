package racing;

import java.util.Objects;

public class Car {
    private static final int MIN_FORWARD_VALUE = 4;
    private Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }
    
    public boolean isWinner(Position maxPositionValue) {
        return position.isSame(maxPositionValue);
    }

    public void move(int number) {
        if( isMove(number) )
            position = position.increase();
    }

    private boolean isMove(int number) {
        return number >= MIN_FORWARD_VALUE;
    }
    
    public Position getPosition() {
        return this.position;
    }
    
    public String getName() {
        return name.getName();
    }
    
    public Position getMaxPositionValue(Position maxPositionValue) {
        if( this.position.isBiggerPositionValue(maxPositionValue) )
            return position;
        return maxPositionValue;
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
        return Objects.equals(name, other.name) && Objects.equals(position, other.position);
    }
}
