package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates;
    private Shape Shape;

    public Coordinates(String line) {
        this.coordinates = initCoordinates(line);
    }

    private List<Coordinate> initCoordinates(String line) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (String coordinate : dashSplit(line) ) {
            String[] values = extractCoordinates(coordinate);
            coordinates.add( new Coordinate(toInt(values[0]), toInt(values[1])) );
        }
        
        if(isStraight(coordinates)) {
            this.Shape = Shape.STRAIGHT;
        }
        
        return coordinates;
    }

    private boolean isStraight(List<Coordinate> coordinates) {
        return coordinates.size() == 2;
    }

    private String[] extractCoordinates(String coordinate) {
        return coordinate.replaceAll("[()]", "").split(",");
    }

    private int toInt(String value) {
        return Integer.parseInt(value.trim());
    }

    private String[] dashSplit(String line) {
        return line.split("-");
    }

    public List<Coordinate> getCoordinates() {
        return this.coordinates;
    }

    public Shape getShape() {
        return this.Shape;
    }

    public double calculateDistance() {
        double dx = getXDiffValue(coordinates.get(0), coordinates.get(1)); // 첫번째 좌표와의 x 차이
        double dy = getYDiffValue(coordinates.get(0), coordinates.get(1)); // 첫번째 좌표와의 y 차이
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    private int getXDiffValue(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return secondCoordinate.getX() - firstCoordinate.getX();
    }
    
    private int getYDiffValue(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return secondCoordinate.getY() - firstCoordinate.getY();
    }

}
