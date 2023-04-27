package fuel;

public class K5 extends AbstractCar {
    private static final int FUEL_EFFICIENCY = 13;
    private String name;
    
    public K5(int distanceToTravel) {
        super(distanceToTravel, FUEL_EFFICIENCY);
        this.name = "K5";
    }

    @Override
    public String getName() {
        return this.name;
    }

}
