package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static RentCompany rentCompany = null;
    private List<AbstractCar> cars = new ArrayList<>();
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String LITER = "리터";
    private static final String COLON_WITH_SPACE = " : ";
    
    public static RentCompany create() {
        if( rentCompany == null ) {
            return new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(AbstractCar car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for( AbstractCar car : cars ) {
            report.append(car.getName())
                    .append(COLON_WITH_SPACE)
                    .append((int) car.getInjectedFuelAmount())
                    .append(LITER)
                    .append(NEWLINE);
        }
        
        return report.toString();
    }

}
