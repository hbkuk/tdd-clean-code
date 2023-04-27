package rentcar;

public class K5 extends AbstractCar {
    private static final int DISTANCE_PER_LITER = 13;
    private String name;

    public K5(int distanceToTravel) {
        super( distanceToTravel, DISTANCE_PER_LITER);
        this.name = "K5";
    }

    @Override
    public String getName() {
        return name;
    }

}
