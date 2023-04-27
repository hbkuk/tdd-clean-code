package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static List<Car> touringCars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        touringCars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        
        for( Car car : touringCars ) {
            report.append(car.getName())
                    .append(" : ")
                    .append((int) car.getInjectFuelAmount()).append("리터")
                    .append(System.lineSeparator());
        }
        return report.toString();
    }

}
