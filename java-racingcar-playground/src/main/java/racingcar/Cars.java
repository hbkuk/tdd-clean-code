package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;
    public Cars(List<String> newCarNames) {
        cars = mapCar(newCarNames);
    }
    private List<Car> mapCar(List<String> newCarNames) {
        List<Car> newCars = new ArrayList<>();
        for( String carName : newCarNames ) {
            newCars.add( new Car(carName) );
        }
        return newCars;
    }
    public List<Car> getCars() {
        return cars;
    }

}
