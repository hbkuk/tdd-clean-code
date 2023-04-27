package fuel;

public class K5 extends Car {
    
    private int distanceToTravel;
    private String name;

    public K5(int distanceToTravel) {
        this.distanceToTravel = distanceToTravel;
        this.name = "K5";
    }

    @Override
    double fuelEfficiency() {
        return 13;
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
