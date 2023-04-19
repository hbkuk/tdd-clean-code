package racingcar;

import java.util.Arrays;
import java.util.List;

public class GenerateUtils {
    private static final int CARS_MAX_LENGTH = 5;

    public static List<String> toList(String stringCars) {
        if( !hasDelimiter(stringCars) ) {
            throw new RuntimeException("구분자를 확인하세요");
        }
        
        if( splitString(stringCars).length > CARS_MAX_LENGTH ) {
            throw new RuntimeException("입력 가능한 자동차의 최대 수는 5입니다.");
        }
        
        return Arrays.asList( splitString(stringCars) ); 
    }

    private static String[] splitString(String stringCars) {
        return stringCars.split(",");
    }

    private static boolean hasDelimiter(String stringCars) {
        return stringCars.contains(",");
    }

}
