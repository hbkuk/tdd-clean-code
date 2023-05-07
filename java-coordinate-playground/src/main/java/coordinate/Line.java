package coordinate;

import java.util.List;

public class Line extends AbstractFigure {
    public final static int LINE_POINTS_SIZE = 2;

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String getName() {
        return "Line";
    }

    @Override
    public int getSize() {
        return LINE_POINTS_SIZE;
    }

    @Override
    public double getArea() {
        return 0;
    }

}
