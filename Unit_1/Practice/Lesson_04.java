package Unit_1.Practice;

import java.util.Scanner;

/**
 * Lesson_04
 */
public class Lesson_04 {
    public static void main(String[] args) {
        System.out.println("Введите числа для бинарного сложения:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("summBinary(a, b) = " + summBinary(a, b));
        scanner.close();
    }

    private static String summBinary(String a, String b) {
        if (a.length() < b.length()) {
            return summBinary(b, a);
        }
        int coach = 0; // todo: Переименовать валидно
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                coach++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                coach++;
            }
            result = coach % 2 + result;
            coach /= 2;
            j--;
        }
        if (coach > 0) {
            result = coach % 2 + result;
        }

        return result;

    }

}