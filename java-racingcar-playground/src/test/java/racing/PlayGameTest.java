package racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayGameTest {
    private PlayGame playGame;
    
    @BeforeEach
    void setUp() {
        playGame = new PlayGame("pobi,crong,honi", 3);
    }
    
    @Test
    void 문자열을_입력받아_차_리스트_생성() {
        assertThat(playGame.getCars())
                .contains( new Car("pobi"), new Car("crong"), new Car("honi"))
                .doesNotContain(new Car("braaa"));
    }
    
    @Test
    void 레이싱_진행중() {
        assertThat(playGame.isGameEnd()).isFalse();
    }
    
    @Test
    void 레이싱_종료() {
        for (int i = 0; i < 3; i++) {
            playGame.race();
        }
        assertThat(playGame.isGameEnd()).isTrue();
    }
}
