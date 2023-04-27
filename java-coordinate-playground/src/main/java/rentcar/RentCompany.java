package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String COLON_WITH_SPACE = " : ";
    private static final String LITER = "리터";
    private static RentCompany rentCompany = null; 
    private List<Car> touringCars = new ArrayList<>();
    
    public static RentCompany create() {
        if( rentCompany == null ) {
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        touringCars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        
        for( Car car : touringCars ) {
            report.append(car.getName())
                    .append(COLON_WITH_SPACE)
                    .append((int) car.getInjectFuelAmount()).append(LITER)
                    .append(NEWLINE);
        }
        return report.toString();
    }

}
