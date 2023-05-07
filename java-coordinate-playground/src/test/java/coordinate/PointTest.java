package coordinate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class PointTest {

    @Test
    void create() {
        Point point = new Point(1, 10);
        assertThat(point).isEqualTo(new Point(1, 10));
    }

    @ParameterizedTest
    @CsvSource(value = {"-1,20", "20,-1","0,10", "10,0", "1,25", "25,1"}, delimiter = ',')
    void create_failed(int x, int y) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Point(x, y))
                .withMessageMatching("1 미만 또는 24를 초과한 숫자를 입력할 수 없습니다.");
    }

    @Test
    void minus() {
        // given
        Point point = new Point(10, 20);
        Point otherPoint = new Point(5, 10);

        //when
        int actualX = point.minusXAxis(otherPoint);
        int actualY = point.minusYAxis(otherPoint);

        //then
        assertThat(actualX).isEqualTo(5);
        assertThat(actualY).isEqualTo(10);
    }

    @Test
    void distance_between_two_points() {
        // given
        Point point = new Point(10, 10);
        Point otherPoint = new Point(14, 15);

        //when
        double actual = point.distance(otherPoint);

        //then
        assertThat(actual).isEqualTo(6.403124, offset(0.000001d));
    }
}
