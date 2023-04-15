package baseball;

public class ResultBall {

    private int strike;
    private int ball;
    
    public ResultBall() {
        this.strike = 0;
        this.ball = 0;
    }
    
    public int getStrike() {
        return strike;
    }
    public void setStrike(int strike) {
        this.strike = strike;
    }
    public int getBall() {
        return ball;
    }
    public void setBall(int ball) {
        this.ball = ball;
    }

}
