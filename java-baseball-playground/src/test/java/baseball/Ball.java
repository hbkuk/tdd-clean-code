package baseball;

import java.util.Objects;

public class Ball {
    private static final int MAX_VALUE = 1;
    private static final int MAX_NUMBER = 9;
    
    private int position;
    private int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = BallNumber(value);
    }
    
    private int BallNumber(int value) {
        if( MAX_VALUE > value || MAX_NUMBER < value ) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public BallStatus play(Ball userBall) {
        if( this.equals(userBall)) {
            return BallStatus.STRIKE;
        }
        if( matchValue(userBall) ) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTTING;
    }

    private boolean matchValue(Ball userBall) {
        return this.getValue() == userBall.getValue();
    }
    
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ball other = (Ball) obj;
        return position == other.position && value == other.value;
    }
}
