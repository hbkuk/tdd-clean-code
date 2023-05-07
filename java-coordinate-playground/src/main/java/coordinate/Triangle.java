package coordinate;

import java.util.List;

public class Triangle extends AbstractFigure {
    public final static int TRIANGLE_POINTS_SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    private double calculatorArea() {
        Point a = getPoints().get(0);
        Point b = getPoints().get(1);
        Point c = getPoints().get(2);

        double sideA = a.distance(b);
        double sideB = b.distance(c);
        double sideC = c.distance(a);

        double semiperimeter = (a.distance(b) + b.distance(c) + c.distance(a)) / 2;

        double area = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));

        return area;
    }

    public static boolean isTriangle(List<Point> points) {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);

        if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
            throw new IllegalArgumentException("삼각형 모양이 아닙니다.");
        }
        return true;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSize() {
        return TRIANGLE_POINTS_SIZE;
    }

    @Override
    public double getArea() {
        return calculatorArea();
    }
}
