package fuel;

public class Avante extends AbstractCar {
    private static final int FUEL_EFFICIENCY = 15;
    private String name;

    public Avante(int distanceToTravel) {
        super(distanceToTravel, FUEL_EFFICIENCY);
        this.name = "Avante";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
