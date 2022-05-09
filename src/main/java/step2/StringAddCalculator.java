package step2;

import java.util.Arrays;

public class StringAddCalculator {

    public static final String DEFAULT_DELIMETER = ",|:";

    public static int splitAndSum(String input) {
        if (input == null) {
            return 0;
        }

        if (input.isEmpty()) {
            return 0;
        }

        if (isSingleDigitNumber(input)) {
            return Integer.valueOf(input);
        }

        return getSumWithDelimiter(input);
    }

    static boolean isSingleDigitNumber(String input) {
        try {
            Integer.valueOf(input);
            return input.length() == 1;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int getSumWithDelimiter(String input) {
        String[] numbers = input.split(DEFAULT_DELIMETER);
        return Arrays.stream(numbers)
                .map(Integer::valueOf)
                .reduce(0, (num1, num2) -> num1 + num2);
    }
}
