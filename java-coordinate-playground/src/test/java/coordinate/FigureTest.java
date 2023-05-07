package coordinate;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

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
        assertThat(figure).isInstanceOf(Line.class);
        assertThat(actureFigureName).isEqualTo("Line");
        assertThat(actureSize).isEqualTo(2);
        assertThat(actureArea).isEqualTo(0);
    }

    @Test
    void create_rectangle() {
        // given
        Figure figure = FigureFactory.getFigure(
                Arrays.asList(new Point(10, 20), new Point(5, 10),
                                new Point(5, 20), new Point(10, 10)));

        //when
        String actureFigureName = figure.getName();
        int actureSize = figure.getSize();
        double actureArea = figure.getArea();

        //then
        assertThat(figure).isInstanceOf(Rectangle.class);
        assertThat(actureFigureName).isEqualTo("Rectangle");
        assertThat(actureSize).isEqualTo(4);
        assertThat(actureArea).isEqualTo(50);
    }

    @Test
    void create_failed_rectangle() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FigureFactory.getFigure(
                        Arrays.asList(new Point(10, 20), new Point(5, 9),
                                new Point(5, 20), new Point(10, 10))))
                .withMessageMatching("직사각형 모양이 아닙니다.");

    }

    @Test
    void create_triangle() {
        // given
        Figure figure = FigureFactory.getFigure(
                Arrays.asList(new Point(10, 10), new Point(14, 15),
                        new Point(20, 8)));

        //when
        String actureFigureName = figure.getName();
        int actureSize = figure.getSize();
        double actureArea = figure.getArea();

        //then
        assertThat(figure).isInstanceOf(Triangle.class);
        assertThat(actureFigureName).isEqualTo("Triangle");
        assertThat(actureSize).isEqualTo(3);
        assertThat(actureArea).isEqualTo(29.0, Offset.offset(1d));
    }

    @Test
    void create_failed_triangle() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FigureFactory.getFigure(
                        Arrays.asList(new Point(10, 10), new Point(14, 15),
                                new Point(10, 10))))
                .withMessageMatching("삼각형 모양이 아닙니다.");
    }

    @Test
    void create_failed_figure() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FigureFactory.getFigure(
                        Arrays.asList(new Point(10, 10), new Point(14, 15),
                                new Point(10, 10), new Point(10, 10), new Point(10, 10) )))
                .withMessageMatching("유효하지 않은 도형입니다.");
    }
}
