package coordinate;

import java.util.List;

public class Line extends Figure {
    public final static int LINE_POINTS_SIZE = 2;
    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    String getName() {
        return "Line";
    }

    @Override
    int getSize() {
        return 2;
    }

    @Override
    double getArea() {
        return 0;
    }

}
