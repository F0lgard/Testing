package org.example;
import java.util.*;

public class RomanNumeralsConverter {
    private static final TreeMap<Integer, String> arabicToRomanMap = new TreeMap<>(Collections.reverseOrder());

    static {
        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");
    }

    public static String arabicToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Число повинно бути в діапазоні від 1 до 3999");
        }
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : arabicToRomanMap.entrySet()) {
            while (number >= entry.getKey()) {
                roman.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return roman.toString();
    }


}
