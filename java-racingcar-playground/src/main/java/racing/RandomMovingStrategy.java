package racing;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private static final int MIN_FORWARD_NUMBER = 4;
    private static final int MAX_BOUND = 10;
    
    @Override
    public boolean movable() {
        return isMove(getRandomNo());
    }
    
    private int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
    
    private boolean isMove(int number) {
        return number >= MIN_FORWARD_NUMBER;
    }
}
