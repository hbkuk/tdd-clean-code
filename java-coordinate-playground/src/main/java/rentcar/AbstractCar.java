package rentcar;

public abstract class AbstractCar implements Car {
    private double distancePerLiter;
    private double distance;
    
    public AbstractCar(int distance, int distancePerLiter) {
        this.distance = distance;
        this.distancePerLiter = distancePerLiter;
    }

    @Override
    public double getInjectFuelAmount() {
        return distance / distancePerLiter;
    }
}
