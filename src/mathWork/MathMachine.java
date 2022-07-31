package mathWork;

public class MathMachine {

    public static String result(String... parts) {

        if(parts.length != 3) {
            throw new IllegalArgumentException();
        }

        int number1;
        int number2;
        String answer = null;

        if(isArabianFormat(parts[0]) && isArabianFormat(parts[2])) {
            number1 = Integer.parseInt(parts[0]);
            number2 = Integer.parseInt(parts[2]);
            answer = String.valueOf(calculation(number1, number2, parts[1]));
        } else if(isArabianFormat(parts[0]) || isArabianFormat(parts[2])) {
            throw new IllegalArgumentException();
        } else {
            number1 = NumberFormatter.format(parts[0].trim());
            number2 = NumberFormatter.format(parts[2].trim());
            answer = NumberFormatter.format(calculation(number1, number2, parts[1]));
        }

        return answer;
    }

    public static boolean isArabianFormat(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int calculation(int num1, int num2, String mathChar) {
        int result = 0;

        switch (mathChar.trim()) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> throw new IllegalArgumentException();
        }
        return result;
    }

}
