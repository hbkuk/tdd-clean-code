package baseball;

public enum BallStatus {
    NOTTING, BALL, STRIKE;
    
    public boolean isStrike() {
        return this == STRIKE;
    }
    
    public boolean isBall() {
        return this == BALL;
    }

    public boolean isNotNotting() {
        return this != NOTTING;
    }
}
