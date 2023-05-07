package coordinate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointsTest {

    @Test
    void create_points() {
        Points points = new Points("(10,10)-(14,15)");
        assertThat(points).isEqualTo(new Points("(10,10)-(14,15)"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(10,10)*(14,15)", "(10,10)$(14,15)", "(10,10)#(14,15)", "(10,10)%(14,15)"})
    void create_failed_points(String input) {
        assertThatIllegalArgumentException()
                            .isThrownBy(() -> {new Points(input);})
                            .withMessageMatching("좌표 사이의 구분자를 정확하게 입력해주세요.");
    }

}