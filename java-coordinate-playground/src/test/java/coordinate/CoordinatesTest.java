package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.junit.jupiter.api.Test;

public class CoordinatesTest {
    
    @Test
    void 문자열로_coordinate_리스트_생성() {
        Coordinates coordinates = new Coordinates("(10,20)-(14,15)");
        
        assertThat(coordinates.getCoordinates())
                    .contains(new Coordinate(10, 20), new Coordinate(14, 15) )
                    .doesNotContain(new Coordinate(10, 10));
    }
    
    @Test
    void 두개의_좌표를_입력했을때_직선인지_확인() {
        Coordinates coordinates = new Coordinates("(10,20)-(14,15)");
        assertThat(coordinates.getShape()).isEqualTo(Shape.STRAIGHT);
    }
    
    @Test
    void 직선일때_두_점_사이의_거리_1() {
        Coordinates coordinates = new Coordinates("(1,10)-(1,11)");
        assertThat(coordinates.calculateDistance())
                    .isEqualTo(1);
    }
    
    @Test
    void 직선일때_두_점_사이의_거리_2() {
        Coordinates coordinates = new Coordinates("(10,1)-(10,11)");
        assertThat(coordinates.calculateDistance())
                    .isEqualTo(10);
    }
    
    @Test
    void 직선일때_두_점_사이의_거리_3() {
        Coordinates coordinates = new Coordinates("(10,20)-(14,15)");
        assertThat(coordinates.calculateDistance())
                    .isEqualTo(6.403, offset(0.00099));
    }
}
