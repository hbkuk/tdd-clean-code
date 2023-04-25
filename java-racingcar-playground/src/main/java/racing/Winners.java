package racing;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<Car> cars;
    
    public Winners(List<Car> cars) {
        this.cars = cars;
    }
    
    public List<Car> findWinners() {
        return findWinners(getMaxPositionValue());
    }
    
    private List<Car> findWinners(int maxPositionValue) {
        List<Car> winners = new ArrayList<>();
        for( Car car : cars ) {
            if( car.getPosition() == maxPositionValue)
                winners.add(car);
        }
        return winners;
    }
    private int getMaxPositionValue() {
        int maxPositionValue = 0;
        for( Car car : cars ) {
            if( car.getPosition() > maxPositionValue)
                maxPositionValue = car.getPosition();
        }
        return maxPositionValue;
    }
}
