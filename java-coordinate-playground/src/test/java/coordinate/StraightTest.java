package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class StraightTest {

    @Test
    void 직선일때_두_점_사이의_거리_1() {
        Straight straight = new Straight(
                    Arrays.asList(new Coordinate(1, 10), new Coordinate(1, 11)));
        assertThat(straight.calculate()).isEqualTo(1);
    }
    
    @Test
    void 직선일때_두_점_사이의_거리_2() {
        Straight straight = new Straight(
                    Arrays.asList(new Coordinate(10, 1), new Coordinate(10, 11)));
        assertThat(straight.calculate()).isEqualTo(10);
    }
    
    @Test
    void 직선일때_두_점_사이의_거리_3() {
        Straight straight = new Straight(
                    Arrays.asList(new Coordinate(10, 20), new Coordinate(14, 15)));
        assertThat(straight.calculate()).isEqualTo(6.403, offset(0.00099));
    }

}
