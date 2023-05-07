package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FigureTest {

    @Test
    void create_line() {
        // given
        Figure figure = FigureFactory.getFigure(
                Arrays.asList(new Point(10, 20), new Point(5, 10)));

        //when
        String actureFigureName = figure.getName();
        int actureSize = figure.getSize();
        double actureArea = figure.getArea();

        //then
        assertThat(actureFigureName).isEqualTo("Line");
        assertThat(actureSize).isEqualTo(2);
        assertThat(actureArea).isEqualTo(0);
    }
}
