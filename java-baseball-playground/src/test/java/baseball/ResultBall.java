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

    public void saveResult(BallStatus status) {
        if( status.isStrike() ) {
            this.strike += 1;
        }
        if( status.isBall() ) {
            this.ball += 1;
        }
    }
    public boolean isGameEnd() {
        return this.strike == 3;
    }
}
