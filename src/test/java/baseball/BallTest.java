package baseball;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {

    @Test
    @DisplayName("위치와 값을 확인하여 NOTTING을 반환")
    void ball_notting() {
        Ball answerBall = new Ball(1, 3);
        Ball userBall = new Ball(1, 4);
        assertThat(answerBall.play(userBall)).isEqualTo(BallStatus.NOTTING);
    }
    
    @Test
    @DisplayName("위치와 값을 확인하여 BALL을 반환")
    void ball_ball() {
        Ball answerBall = new Ball(1, 3);
        Ball userBall = new Ball(2, 3);
        assertThat(answerBall.play(userBall)).isEqualTo(BallStatus.BALL);
    }
    
    @Test
    @DisplayName("위치와 값을 확인하여 Strike을 반환")
    void ball_strike() {
        Ball answerBall = new Ball(1, 3);
        Ball userBall = new Ball(1, 3);
        assertThat(answerBall.play(userBall)).isEqualTo(BallStatus.STRIKE);
    }
}
