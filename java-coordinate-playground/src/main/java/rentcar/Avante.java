package rentcar;

public class Avante extends AbstractCar {
    private static final int DISTANCE_PER_LITER = 15;
    private String name;
    
    public Avante(int distanceToTravel) {
        super( distanceToTravel, DISTANCE_PER_LITER);
        this.name = "Avante";
    }

    @Override
    public String getName() {
        return name;
    }

}
