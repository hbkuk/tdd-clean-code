package coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CoordinateTest {

    @Test
    void create() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertThat(coordinate.getX()).isEqualTo(new XCoordinate(1));
        assertThat(coordinate.getY()).isEqualTo(new YCoordinate(2));;
    }
    
    @ParameterizedTest
    @CsvSource({ "-1, 0", "0, -1", "-1, -1" })
    void 음수로_설정할_경우(int x, int y) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> { Coordinate coordinate = new Coordinate(x, y); })
                .withMessageMatching("좌표를 음수의 값으로 설정할 수 없습니다.");
    }
    
    @ParameterizedTest
    @CsvSource({ "25, 0", "25, 0", "25, 25" })
    void 최대값인_24보다_큰_수로_설정할_경우(int x, int y) {
        assertThatIllegalArgumentException()
        .isThrownBy(() -> {Coordinate coordinate = new Coordinate(x, y);})
        .withMessageMatching("좌표를 24보다 큰 값으로 설정할 수 없습니다.");
    }
    
}
