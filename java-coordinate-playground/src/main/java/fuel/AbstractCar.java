package fuel;

public abstract class AbstractCar implements Car {
    private double distanceToTravel;
    private double fuelEfficiency;
    
    public AbstractCar(double distanceToTravel, double fuelEfficiency ) {
        this.distanceToTravel = distanceToTravel;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public double getInjectedFuelAmount() {
        return distanceToTravel / fuelEfficiency; 
    }
}
