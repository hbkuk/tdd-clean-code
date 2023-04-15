package baseball;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

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
    
    @Test
    @DisplayName("Balls와 Ball을 비교해서 Notting을 반환")
    void balls_vs_ball_notting() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        Ball userBall = new Ball(1, 4);
        
        assertThat(answerBalls.play(userBall)).isEqualTo(BallStatus.NOTTING);
    }
    
    @Test
    @DisplayName("Balls와 Ball을 비교해서 Ball을 반환")
    void balls_vs_ball_ball() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        Ball userBall = new Ball(3, 1);
        
        assertThat(answerBalls.play(userBall)).isEqualTo(BallStatus.BALL);
    }
    
    @Test
    @DisplayName("Balls와 Ball을 비교해서 Strike을 반환")
    void balls_vs_ball_strike() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        Ball userBall = new Ball(3, 3);
        
        assertThat(answerBalls.play(userBall)).isEqualTo(BallStatus.STRIKE);
    }
    
    @Test
    @DisplayName("answerBalls과 userBalls를 비교한 후 Notting")
    void balls_vs_balls_notting() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        
        answerBalls.playBall(Arrays.asList(4,5,6));
        
        assertThat(answerBalls.getResultBall().getStrike()).isEqualTo(0);
        assertThat(answerBalls.getResultBall().getBall()).isEqualTo(0);
    }
    
    @Test
    @DisplayName("answerBalls과 userBalls를 비교한 후 3Ball ")
    void balls_vs_balls_3ball() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        
        answerBalls.playBall(Arrays.asList(3,1,2));
        
        assertThat(answerBalls.getResultBall().getStrike()).isEqualTo(0);
        assertThat(answerBalls.getResultBall().getBall()).isEqualTo(3);
    }
    
    @Test
    @DisplayName("answerBalls과 userBalls를 비교한 후 3Strike ")
    void balls_vs_balls_3strike() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        
        answerBalls.playBall(Arrays.asList(1,2,3));
        
        assertThat(answerBalls.getResultBall().getStrike()).isEqualTo(3);
        assertThat(answerBalls.getResultBall().getBall()).isEqualTo(0);
    }
    
    @Test
    @DisplayName("answerBalls과 userBalls를 비교한 후 1Strike 2Ball ")
    void balls_vs_balls_1strike_2ball() {
        Balls answerBalls = new Balls(Arrays.asList(1,2,3));
        
        answerBalls.playBall(Arrays.asList(1,3,2));
        
        assertThat(answerBalls.getResultBall().getStrike()).isEqualTo(1);
        assertThat(answerBalls.getResultBall().getBall()).isEqualTo(2);
    }
    
}
