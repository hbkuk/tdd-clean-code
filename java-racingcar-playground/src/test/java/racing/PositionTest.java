package racing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

public class PositionTest {
    
    @Test
    void create() {
        Position position = new Position(1);
        assertThat(position).isEqualTo(new Position(1));
    }
    
    @Test
    void 음수를_전달할_경우_Exception() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {Position position = new Position(-1);})
                .withMessageMatching("position을 음수로 지정할 수 없습니다.");
    }
    
    @Test
    void position_증가() {
        Position position = new Position(1);
        assertThat(position.increase()).isEqualTo(new Position(2));
    }
}
