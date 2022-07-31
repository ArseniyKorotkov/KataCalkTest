package mathWork;

import java.util.Scanner;
import static mathWork.MathMachine.*;

public class CalculatorRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quest = sc.nextLine();
        String[] parts = quest.split(" ");

        System.out.println(result(parts));

    }
}
