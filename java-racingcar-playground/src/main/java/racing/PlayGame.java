package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayGame {
    private List<Car> cars;
    private int tryNumber;

    public PlayGame(String carNames, int tryNumber) {
        this.cars = initCars(carNames);
        this.tryNumber = tryNumber;
    }

    private List<Car> initCars(String carNames) {
        if( StringUtils.isBlanck(carNames))
            throw new IllegalArgumentException("1글자 이상을 입력해야 합니다.");
        String[] newCars = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for( String car : newCars ) {
            cars.add(new Car(car));
        }
        return cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public boolean isGameEnd() {
        return this.tryNumber == 0;
    }

    public void race() {
        move();
        this.tryNumber--;
    }

    private void move() {
        for( Car car : cars ) {
            car.move(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
