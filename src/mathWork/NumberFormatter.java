package mathWork;

import java.util.HashMap;
import java.util.Map;

public class NumberFormatter {

    public static String format(int number) {
        Map<Integer, String> romesFormat = new HashMap<>();
        romesFormat.put(1, "I");
        romesFormat.put(2, "II");
        romesFormat.put(3, "III");
        romesFormat.put(4, "IV");
        romesFormat.put(5, "V");
        romesFormat.put(6, "VI");
        romesFormat.put(7, "VII");
        romesFormat.put(8, "VIII");
        romesFormat.put(9, "IX");
        romesFormat.put(10, "X");

        String result = romesFormat.get(number);
        if(result == null) {
            throw new IllegalArgumentException();
        }

        return result;
    }

    public static Integer format(String number) {
        Map<String, Integer> romesFormat = new HashMap<>();
        romesFormat.put("I", 1);
        romesFormat.put("II", 2);
        romesFormat.put("III", 3);
        romesFormat.put("IV", 4);
        romesFormat.put("V", 5);
        romesFormat.put("VI", 6);
        romesFormat.put("VII", 7);
        romesFormat.put("VIII", 8);
        romesFormat.put("IX", 9);
        romesFormat.put("X", 10);

        Integer result = romesFormat.get(number);
        if(result == null) {
            throw new IllegalArgumentException();
        }

        return result;
    }
}
