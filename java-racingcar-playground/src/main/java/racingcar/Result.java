package racingcar;

import java.util.ArrayList;
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
        if( isNotting(playEndCars) ) {
            return null;
        }
        List<Car> cars = playEndCars.getCars();
        List<Car> winningCars = cars.stream()
                .filter(Car -> Car.getPosition() == maxPositionValue(playEndCars) )
                .collect(Collectors.toList());
        return winningCars;
    }

    private static boolean isNotting(Cars playEndCars) {
        return maxPositionValue(playEndCars) == 0;
    }

    public static List<String> getHyphenPerPosition(Cars playEndCars) {
        List<String> hyphens = new ArrayList<>();
        for( Car car : playEndCars.getCars() ) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < car.getPosition(); i++) {
                stringBuilder.append("-");
            }
            hyphens.add(stringBuilder.toString());
        }
        return hyphens;
    }
}
