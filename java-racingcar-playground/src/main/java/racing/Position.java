package racing;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int value) {
        if( value < 0 ) {
            throw new IllegalArgumentException("position을 음수로 지정할 수 없습니다.");
        }
        this.position = value;
    }

    public boolean isSame(Position maxPositionValue) {
        return this.position == maxPositionValue.position;
    }
    
    public Position increase() {
        return new Position(this.position + 1 );
    }
    
    public int getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Position other = (Position) obj;
        return position == other.position;
    }

    public boolean isBiggerPositionValue(Position maxPositionValue) {
        return this.position > maxPositionValue.position;
    }
}
