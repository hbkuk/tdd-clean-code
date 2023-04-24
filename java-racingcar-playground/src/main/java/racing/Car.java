package racing;

import java.util.Objects;

public class Car {
    private static final int MIN_FORWARD_VALUE = 4;
    private static final int MAX_NAME_LENGTH_VALUE = 5;
    private String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        if( StringUtils.isBlanck(name) ) 
            throw new IllegalArgumentException("1글자 이상을 입력해야 합니다.");
        
        if( isInvalidNameLegnth(name) )
            throw new IllegalArgumentException("5글자를 초과할 수 없습니다.");
        this.name = name;
        this.position = position;
    }

    private boolean isInvalidNameLegnth(String name) {
        return name.length() > MAX_NAME_LENGTH_VALUE;
    }

    public void move(int number) {
        if( isMove(number) )
            this.position ++;
    }

    private boolean isMove(int number) {
        return number >= MIN_FORWARD_VALUE;
    }
    
    public int getPosition() {
        return this.position;
    }
    
    public String getName() {
        return name;
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
