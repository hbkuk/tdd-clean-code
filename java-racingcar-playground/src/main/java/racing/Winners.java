package racing;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    public static List<Car> findWinners(List<Car> cars) {
        List<Car> winners = new ArrayList<>();
        for( Car car : cars ) {
            if( car.getPosition() == getMaxPositionValue(cars) ) {
                winners.add(car);
            }
        }
        return winners;
    }

    private static int getMaxPositionValue(List<Car> cars) {
        int maxPositionValue = 0;
        for( Car car : cars ) {
            if( car.getPosition() > maxPositionValue ) {
                maxPositionValue = car.getPosition(); 
            }
        }
        return maxPositionValue;
    }

}
