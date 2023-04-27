package fuel;

public class Sonata extends Car{
    private int distanceToTravel;
    private String name;

    public Sonata(int distanceToTravel) {
        this.distanceToTravel = distanceToTravel;
        this.name = "Sonata";
    }

    @Override
    double fuelEfficiency() {
        return 10;
    }

    @Override
    double getDistanceToTravel() {
        return this.distanceToTravel;
    }

    @Override
    String getName() {
        return this.name;
    }

}
