package coordinate;

import java.util.List;

public abstract class AbstractFigure implements Figure {
    private final List<Point> points;

    public AbstractFigure(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

}
