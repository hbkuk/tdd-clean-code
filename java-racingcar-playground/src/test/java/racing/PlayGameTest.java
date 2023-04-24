package racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayGameTest {
    private PlayGame playGame;
    
    @BeforeEach
    void setUp() {
        this.playGame = new PlayGame("pobi,crong,honux", 3);
    }
    
    @Test
    void 자동차의_이름을_문자열로_전달() {
        assertThat(playGame.getCars())
            .contains(new Car("pobi"),
                    new Car("crong"),
                    new Car("honux"));
    }
    
    @Test
    void 레이싱_종료일때_확인() {
        int tryNumber = playGame.getTryNumber();
        for (int i = 0; i < tryNumber; i++) {
            playGame.race();
        }
        assertThat( playGame.isGameEnd() ).isTrue();
    }
    
    @Test
    void 레이싱_종료가_아닐때_확인() {
        assertThat( playGame.isGameEnd() ).isFalse();
    }
}
