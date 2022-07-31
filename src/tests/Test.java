package tests;

import static mathWork.MathMachine.result;

//  тесты взяты с ТЗ
public class Test {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    private static void test1() {
        String answer = result("1 + 2".split(" "));
        if(answer.equals("3")) {
            System.out.println("Test 1: OK");
        } else {
            System.err.println("Test 1: FALSE");
        }
    }

    private static void test2() {
        String answer = result("VI / III".split(" "));
        if(answer.equals("II")) {
            System.out.println("Test 2: OK");
        } else {
            System.err.println("Test 2: FALSE");
        }
    }

    private static void test3() {
        try {
            result("I - II".split(" "));
            System.err.println("Test 3: FALSE");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3: OK");
        }
    }

    private static void test4() {
        try {
            result("1".split(" "));
            System.err.println("Test 4: FALSE");
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Test 4: OK");
        }
    }

    private static void test5() {
        try {
            result("1 + 2 + 3".split(" "));
            System.err.println("Test 5: FALSE");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 5: OK");
        }
    }
}
