package coordinate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class YCoordinateTest {
 
    @Test
    void create() {
        YCoordinate yCoordinate = new YCoordinate(3);
        assertThat(yCoordinate)
                .isEqualTo(new YCoordinate(3));
    }
}
