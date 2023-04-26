package coordinate;

import java.util.Objects;

public class YCoordinate {
    private int y;

    public YCoordinate(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        YCoordinate other = (YCoordinate) obj;
        return y == other.y;
    }

    public double subtract(YCoordinate yCoordinate) {
        return this.y - yCoordinate.y;
    }

}
