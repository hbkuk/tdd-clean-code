package coordinate;

import java.util.Objects;

public class Point {
    public static final int MIN_POSITION_VALUE = 1;
    public static final int MAX_POSITION_VALUE = 24;
    public static final String NEW_CONSTUCTOR_EXCEPTION_MESSAGE =
            String.format("입력범위를 초과했습니다. 입력범위는 %d이상 %d이하 입니다.",
                                        MIN_POSITION_VALUE, MAX_POSITION_VALUE);
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if( isInvalidNumber(x) || isInvalidNumber(y)) {
            throw new IllegalArgumentException(NEW_CONSTUCTOR_EXCEPTION_MESSAGE);
        }
        this.x = x;
        this.y = y;
    }

    private boolean isInvalidNumber(int number) {
        return number < MIN_POSITION_VALUE || number > MAX_POSITION_VALUE;
    }

    public boolean isSameY(int number) {
        return this.y == number;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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


}
