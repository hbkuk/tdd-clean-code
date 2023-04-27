package rentcar;

public class K5 extends AbstractCar {
    private int distanceToTravel;
    private static final String CAR_NAME = "K5";
    private static final int DISTANCE_PER_LITER = 13;

    public K5(int distanceToTravel) {
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
