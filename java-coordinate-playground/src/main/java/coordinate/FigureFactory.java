package coordinate;

import java.util.List;

public class FigureFactory {
    public static Figure getFigure(List<Point> points) {
        return new Line();
    }
}
