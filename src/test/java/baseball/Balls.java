package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> answerBalls;
    private ResultBall result;

    public Balls(List<Integer> values) {
        result = new ResultBall();
        answerBalls = integersToBalls(values);
    }

    private List<Ball> integersToBalls(List<Integer> values) {
        List<Ball> balls = new ArrayList<>();
        for (int postion = 0; postion < values.size(); postion++) {
            balls.add( new Ball( postion + 1, values.get(postion) ));
        }
        return balls;
    }

    public BallStatus play(Ball userBall) {
        return answerBalls.stream()
                    .map(ball -> ball.play(userBall))
                    .filter(status -> status != BallStatus.NOTTING)
                    .findFirst()
                    .orElse(BallStatus.NOTTING);
    }

    public void playBall(List<Integer> values) {
        List<Ball> userBalls = integersToBalls(values);
        for( Ball userBall : userBalls ) {
            saveResult(this.play(userBall));
        }
    }
    private void saveResult(BallStatus status) {
        if( status == BallStatus.STRIKE ) {
            result.setStrike(result.getStrike() + 1);
        }
        
        if( status == BallStatus.BALL ) {
            result.setBall(result.getBall() + 1);
        }
    }
    public List<Ball> getAnswerBalls() {
        return answerBalls;
    }
    
    public void setAnswerBalls(List<Ball> answerBalls) {
        this.answerBalls = answerBalls;
    }

    public ResultBall getResultBall() {
        return result;
    }

    public void setResultBall(ResultBall resultBall) {
        this.result = resultBall;
    }
    
}
