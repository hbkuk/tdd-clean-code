package rentcar;

public class Sonata extends AbstractCar {
    private static final int DISTANCE_PER_LITER = 10;
    private String name;

    public Sonata(int distanceToTravel) {
        super( distanceToTravel, DISTANCE_PER_LITER);
        this.name = "Sonata";
    }

    @Override
    public String getName() {
        return name;
    }
    
    

}
