package coordinate;

import java.util.List;

public class ResultView {
    private StringBuilder graphBuilder = new StringBuilder();
    private Points points;

    public ResultView(Points points) {
        this.points = points;
    }

    public void Result( ) {
        generateGraph(points.getPoints());

        System.out.println(graphBuilder.toString());
        System.out.println(String.format("두 점 사이 거리는 %f", points.getDistance()));
    }

    private void generateGraph(List<Point> pointList) {
        generateAxisY(pointList);
        generateOrigin();
        generateAxisX();
    }

    private void generateOrigin() {
        graphBuilder.append(String.format("%3s", "+"));
    }

    private void generateAxisY(List<Point> pointList) {
        for (int i = 0; i < 24; i++) {
            if( i % 2 == 0) {
                graphBuilder.append(String.format("%2d", 24 - i)).append("|");
            }
            if( i % 2 != 0) {
                graphBuilder.append(String.format("%3s", "|"));
            }
            for( Point point : pointList) {
                if( point.isSameY(24 - i) ) {
                    for (int j = 0; j < point.getX() - 1; j++) {
                        graphBuilder.append("  ");
                    }
                    graphBuilder.append(String.format("%2s", "*"));
                }
            }
            graphBuilder.append(System.lineSeparator());
        }
    }

    private void generateAxisX() {
        for (int i = 0; i < 24; i++) {
            graphBuilder.append("--");
        }
        graphBuilder.append(System.lineSeparator()).append(String.format("%2d", 0)).append(" ");
        for (int i = 1; i <= 24; i++) {
            if( i % 2 == 0) {
                graphBuilder.append(String.format("%2d", i));
            }

            if( i % 2 != 0) {
                graphBuilder.append("  ");
            }
        }
    }
}
