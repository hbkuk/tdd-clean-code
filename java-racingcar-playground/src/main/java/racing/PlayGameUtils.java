package racing;

import java.util.List;

public class PlayGameUtils {
    
    private static String getDashPerPosition(Car car) {
        return "-".repeat(car.getPosition());
    }
    
    public static void getResultPerRace(List<Car> cars, StringBuilder builder) {
        for( Car car : cars ) {
            builder.append(car.getName()).append(" : ").append(getDashPerPosition(car)).append(System.lineSeparator());
        }
        builder.append(System.lineSeparator());
    }
}
