package coordinate;

import java.util.Objects;

public class Point {
    private static final int MIX_POINT_VALUE = 1;
    private static final int MAX_POINT_VALUE = 24;
    private static final String CONSTRUCTOR_EXCEPTION_MESSAGE =
                    String.format("%d 미만 또는 %d를 초과한 숫자를 입력할 수 없습니다.",
                            MIX_POINT_VALUE, MAX_POINT_VALUE);
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if(isInvalidNumber(x)) {
            throw new IllegalArgumentException(CONSTRUCTOR_EXCEPTION_MESSAGE);
        }
        this.x = x;

        if(isInvalidNumber(y)) {
            throw new IllegalArgumentException("1 미만 또는 24를 초과한 숫자를 입력할 수 없습니다.");
        }
        this.y = y;
    }

    public int minusYAxis(Point otherPoint) {
        return this.y - otherPoint.y;
    }

    public int minusXAxis(Point otherPoint) {
        return this.x - otherPoint.x;
    }

    private boolean isInvalidNumber(int number) {
        return number < MIX_POINT_VALUE || number > MAX_POINT_VALUE;
    }

    public double distance(Point otherPoint) {
        int dx = minusXAxis(otherPoint);
        int dy = minusYAxis(otherPoint);

        return Math.sqrt(square(dx) + square(dy));
    }

    private int square(int number) {
        return number * number;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
