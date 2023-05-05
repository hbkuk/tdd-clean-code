package coordinate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class PointTest {

    @Test
    void create_point() {
        Point point = new Point(1, 10);
        assertThat(point).isEqualTo(new Point(1, 10));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "24:24", "1:24", "24:1"}, delimiter = ':')
    void 입력_범위_정상(String x, String y) {
        Point point = new Point(Integer.parseInt(x), Integer.parseInt(y));
        assertThat(point).isEqualTo(new Point(Integer.parseInt(x), Integer.parseInt(y)));
    }

    @ParameterizedTest
    @CsvSource(value = {"0:10", "10:0", "10:25", "25:10"}, delimiter = ':')
    void 입력_범위_초과(String x, String y) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {new Point(Integer.parseInt(x), Integer.parseInt(y));})
                .withMessageMatching("입력범위를 초과했습니다. 입력범위는 1이상 24이하 입니다.");
    }
}
