package baseball;

import java.util.Objects;

public class Ball {

    private int position;
    private int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
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
