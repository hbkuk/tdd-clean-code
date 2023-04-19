package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    
    private List<Car> cars;

    public Cars(List<String> parameters) {
        List<Car> carNames = new ArrayList<Car>();
        for( String carName : parameters) {
            carNames.add(new Car(carName));
        }
        this.cars = carNames;
    }

    public List<Car> getCars() {
        return cars;
    }
}
