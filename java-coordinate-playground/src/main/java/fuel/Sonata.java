package fuel;

public class Sonata extends AbstractCar{
    private static final int FUEL_EFFICIENCY = 10;
    private String name;

    public Sonata(int distanceToTravel) {
        super(distanceToTravel, FUEL_EFFICIENCY);
        this.name = "Sonata";
    }

    @Override
    public String getName() {
        return this.name;
    }

}
