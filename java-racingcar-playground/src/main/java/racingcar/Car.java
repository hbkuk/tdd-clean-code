package racingcar;

public class Car {
    private static final int MAX_FORWARD_VALUE = 4;
    private static final int MAX_NAME_LENGTH = 5;
    
    private String name;
    public int position;

    public Car(String name) {
        if( isInValidNameLength(name) ) {
            throw new IllegalArgumentException("차의 이름을 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    private boolean isInValidNameLength(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }

    public void move(int number) {
        if( isMaxExceeded(number) ) {
            this.position ++;
        }
    }

    private boolean isMaxExceeded(int number) {
        return number >= MAX_FORWARD_VALUE;
    }
    public String getName() {
        return name;
    }
    
    public int getPosition() {
        return position;
    }
}
