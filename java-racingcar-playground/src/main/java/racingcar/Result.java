package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Result {
    
    public static int maxPositionValue(Cars playEndCars) {
        List<Car> cars = playEndCars.getCars();
        int maxPositionValue = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
        return maxPositionValue;
    }

    public static List<Car> getWinningCars(Cars playEndCars) {
        if( maxPositionValue(playEndCars) == 0 ) {
            return null;
        }
        List<Car> cars = playEndCars.getCars();
        List<Car> winningCars = cars.stream()
                .filter(Car -> Car.getPosition() == maxPositionValue(playEndCars) )
                .collect(Collectors.toList());
        return winningCars;
    }
}
