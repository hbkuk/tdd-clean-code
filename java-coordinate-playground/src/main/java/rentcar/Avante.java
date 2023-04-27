package rentcar;

public class Avante extends Car {
    private int distanceToTravel;
    private static final String CAR_NAME = "Avante";
    private static final int DISTANCE_PER_LITER = 15;
    
    public Avante(int distanceToTravel) {
        this.distanceToTravel = distanceToTravel;
    }

    @Override
    int getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    int distanceToTravel() {
        return this.distanceToTravel;
    }

    @Override
    String getName() {
        return CAR_NAME;
    }

}
