package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates(String line) {
        this.coordinates = initCoordinates(line);
    }

    private List<Coordinate> initCoordinates(String line) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (String coordinate : dashSplit(line) ) {
            String[] values = extractCoordinates(coordinate);
            coordinates.add( new Coordinate(toInt(values[0]), toInt(values[1])) );
        }
        return coordinates;
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
}
