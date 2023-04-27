package fuel;

public abstract class Car {
    
    /*
     * 연비 
     */
    abstract double fuelEfficiency();
    
    /*
     * 여행할 거리 
     */
    abstract double getDistanceToTravel();
    
    /*
     * 차량 이름 
     */
    abstract String getName();
    
    /*
     * 주입할 연료량 
     */
    double getInjectedFuelAmount() {
        return getDistanceToTravel() / fuelEfficiency(); 
    }
}
