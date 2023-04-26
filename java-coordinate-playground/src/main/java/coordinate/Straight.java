package coordinate;

import java.util.List;

public class Straight extends Shape{
    private List<Coordinate> coordinates;

    public Straight(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public double calculate() {
        double dx = getXDiffValue(coordinates.get(0), coordinates.get(1)); // 첫번째 좌표와의 x 차이
        double dy = getYDiffValue(coordinates.get(0), coordinates.get(1)); // 첫번째 좌표와의 y 차이
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    private Double getXDiffValue(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return secondCoordinate.getX().subtract(firstCoordinate.getX());
    }
    
    private Double getYDiffValue(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return secondCoordinate.getY().subtract(firstCoordinate.getY());
    }
    
}
