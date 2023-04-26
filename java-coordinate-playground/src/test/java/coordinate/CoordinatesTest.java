package coordinate;

import static org.assertj.core.api.Assertions.assertThat;

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
}
