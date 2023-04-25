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
    
    private List<Car> findWinners(Position maxPositionValue) {
        List<Car> winners = new ArrayList<>();
        for( Car car : cars ) {
            if( car.isWinner(maxPositionValue) )
                winners.add(car);
        }
        return winners;
    }
    private Position getMaxPositionValue() {
        Position maxPositionValue = new Position(0);
        for( Car car : cars ) {
            maxPositionValue = car.getMaxPositionValue(maxPositionValue);
        }
        return maxPositionValue;
    }
}
