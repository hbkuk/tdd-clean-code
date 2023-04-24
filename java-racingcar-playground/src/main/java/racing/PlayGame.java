package racing;

import java.util.ArrayList;
import java.util.List;

public class PlayGame {
    private final List<Car> cars;
    private int tryNumber;

    public PlayGame(String carNames, int tryNumber) {
        this.cars = initCars(carNames);
        this.tryNumber = tryNumber;
    }

    private List<Car> initCars(String carNames) {
        List<Car> newCars = new ArrayList<>();
        
        String[] cars = carNames.split(",");
        
        for( String carName : cars ) {
            newCars.add(new Car(carName));
        }
        return newCars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public boolean isGameEnd() {
        return tryNumber == 0;
    }

    public void race() {
        for( Car car : cars ) {
            car.move(new RandomMovingStrategy());
        }
        this.tryNumber -=1;
    }

}
