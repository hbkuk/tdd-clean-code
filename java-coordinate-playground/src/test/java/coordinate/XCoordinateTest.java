package coordinate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class XCoordinateTest {
    
    @Test
    void create() {
        XCoordinate xCoordinate = new XCoordinate(3);
        assertThat(xCoordinate)
                .isEqualTo(new XCoordinate(3));
    }
    
}
