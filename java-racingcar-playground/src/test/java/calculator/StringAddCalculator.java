package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if( isBlank(text) ) {
            return 0;
        }
        String[] splitValues = split(text);
        int sum = calculatorSum(splitValues);
        return sum;
    }

    private static int calculatorSum(String[] splitValues) {
        int sum = 0;
        for( String value : splitValues ) {
            if( !isPositiveNumber(value) ) {
                throw new RuntimeException();
            }
            sum+= toInt(value);
        }
        return sum;
    }

    private static boolean isPositiveNumber(String value) {
        return toInt(value) > 0;
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }

    private static String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if( m.find() ) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }
        return text.split(",|:");
    }

    private static boolean isBlank(String string) {
        return string == null || string.equals("");
    }

}
