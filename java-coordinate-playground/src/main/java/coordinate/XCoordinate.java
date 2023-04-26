package coordinate;

import java.util.Objects;

public class XCoordinate {
    private int x;

    public XCoordinate(int x) {
        this.x = x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        XCoordinate other = (XCoordinate) obj;
        return x == other.x;
    }

    public double subtract(XCoordinate xCoordinate) {
        return this.x - xCoordinate.x;
    }

}
