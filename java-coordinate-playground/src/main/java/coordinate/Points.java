package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Points {

    private List<Point> points;

    private static final String COORDINATES_DELIMETER = "-";
    private static final String COORDINATE_PATTERN = "\\((\\d+),(\\d+)\\)";
    private static final String COORDINATES_PATTERN = "\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)";
    private static final String COORDINATES_REGEX_MATCHING_FAILED_MESSAGE = "좌표 사이의 구분자를 정확하게 입력해주세요.";
    private static final String COORDINATE_REGEX_MATCHING_FAILED_MESSAGE = "좌표를 정확하게 입력해주세요.";

    public Points(String line) {
        this.points = initPoints(line);
    }

    private List<Point> initPoints(String line) {
        List<Point> points = new ArrayList<>();
        if( !Pattern.matches(COORDINATES_PATTERN, line) ) {
            throw new IllegalArgumentException(COORDINATES_REGEX_MATCHING_FAILED_MESSAGE);
        }

        for( String coordinate : line.split(COORDINATES_DELIMETER) ) {
            points.add(mapPoint(Pattern.compile(COORDINATE_PATTERN), coordinate));
        }
        return points;
    }

    private Point mapPoint(Pattern pattern, String coordinate) {
        Matcher matcher = pattern.matcher(coordinate);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(COORDINATE_REGEX_MATCHING_FAILED_MESSAGE);
        }
        return new Point(toInt(matcher.group(1)), toInt(matcher.group(2)));
    }

    private int toInt(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
