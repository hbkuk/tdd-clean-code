package rentcar;

public abstract class Car {
    
    abstract int getDistancePerLiter();

    abstract int distanceToTravel();
    
    abstract String getName();

    public double getInjectFuelAmount() {
        return distanceToTravel() / getDistancePerLiter();
    }
}
