package racingcar;

import java.util.Arrays;
import java.util.List;


public class CarsGenerateUtils {

    public static List<String> toList(String names) {
        
        if( !hasDelimeter(names) ) {
            throw new RuntimeException("구분자로 이름을 나누어서 입력해야 합니다.");
        }
        
        return Arrays.asList( split(names) );
        
    }

    private static String[] split(String names) {
        return names.split(",");
    }

    private static boolean hasDelimeter(String names) {
        return names.contains(",");
    }

}
