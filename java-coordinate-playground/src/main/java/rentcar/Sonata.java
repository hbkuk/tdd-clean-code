package rentcar;

public class Sonata extends AbstractCar{
    private static final String CAR_NAME = "Sonata";
    private int distanceToTravel;
    private static final int DISTANCE_PER_LITER = 10;

    public Sonata(int distanceToTravel) {
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
