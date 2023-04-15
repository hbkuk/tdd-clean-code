package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> answerBalls;

    public Balls(List<Integer> values) {
        answerBalls = new ArrayList<>();
        for (int postion = 0; postion < values.size(); postion++) {
            answerBalls.add( new Ball( postion + 1, values.get(postion) ));
        }
    }

    public BallStatus play(Ball userBall) {
        return answerBalls.stream()
                    .map(ball -> ball.play(userBall))
                    .filter(status -> status != BallStatus.NOTTING)
                    .findFirst()
                    .orElse(BallStatus.NOTTING);
    }

}
