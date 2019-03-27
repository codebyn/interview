package com.codebyn.interview;

public class ExcelColumnNameMapper {

    public static String calculateMapping(int number) {
        String mapping = "";
        final int ALPHABET_COUNT = 26;
        final int INT_VALUE_OF_CHAR_A = 65;
        final int INCREMENTER_FOR_CASTING_TO_CHAR = INT_VALUE_OF_CHAR_A - 1;

        //eg: number = 52
        if (number > 0) {
            if (number <= ALPHABET_COUNT) {//cast to char
                mapping += String.valueOf((char) (number + INCREMENTER_FOR_CASTING_TO_CHAR));
            } else {
                //recurse with quotient
                //and then cast remainder to char

                int quotient = number / ALPHABET_COUNT; //2
                int remainder = number % ALPHABET_COUNT; //0

                if (remainder == 0) {
                    mapping = calculateMapping(quotient - 1) + mapping;
                    mapping = mapping + calculateMapping(ALPHABET_COUNT);
                } else {
                    mapping += calculateMapping(quotient);
                }

                mapping = calculateMapping(remainder) + mapping;
            }
        }

        return mapping;
    }
}

