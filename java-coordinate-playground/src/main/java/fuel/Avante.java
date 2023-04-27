package fuel;

public class Avante extends Car {

    private int distanceToTravel;
    private String name;

    public Avante(int distanceToTravel) {
        this.distanceToTravel = distanceToTravel;
        this.name = "Avante";
    }

    @Override
    double fuelEfficiency() {
        return 15;
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
