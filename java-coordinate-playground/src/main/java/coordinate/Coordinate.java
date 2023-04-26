package coordinate;

import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;
    private static final int MAX_COORDINATE_VALUE = 24;

    public Coordinate(int x, int y) {
        if( isLessThanZero(x) || isLessThanZero(y) ) {
            throw new IllegalArgumentException("좌표를 음수의 값으로 설정할 수 없습니다.");
        }
        if( isOutOfBound(x) || isOutOfBound(y) ) {
            throw new IllegalArgumentException(String.format("좌표를 %d보다 큰 값으로 설정할 수 없습니다.", MAX_COORDINATE_VALUE));
        }
        this.x = x;
        this.y = y;
    }

    private boolean isOutOfBound(int number) {
        return number > MAX_COORDINATE_VALUE;
    }

    private boolean isLessThanZero(int number) {
        return number < 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coordinate other = (Coordinate) obj;
        return x == other.x && y == other.y;
    }
}
