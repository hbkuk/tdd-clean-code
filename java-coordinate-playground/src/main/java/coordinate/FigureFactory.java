package coordinate;

import java.util.List;

public class FigureFactory {
    public static Figure getFigure(List<Point> points) {
        if( points.size() == Line.LINE_POINTS_SIZE ) {
            return new Line(points);
        }

        if( points.size() == Rectangle.RECTANGLE_POINTS_SIZE && Rectangle.isRectangle(points) ) {
            return new Rectangle(points);
        }

        if( points.size() == Triangle.TRIANGLE_POINTS_SIZE && Triangle.isTriangle(points) ) {
            return new Triangle(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
