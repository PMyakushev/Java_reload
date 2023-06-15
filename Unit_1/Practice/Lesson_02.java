package Unit_1.Practice;

import java.util.Scanner;

/**
 * Lesson_02
 */
public class Lesson_02 {

    public static void main(String[] args) {

        System.out.println("введите число n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("lessontwo(n, scanner) = " + lessontwo(n, scanner));

    }

    /**
     * @apiNote
     * @param n       int
     * @param scanner scanner
     * @return count
     */
    private static int lessontwo(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0)
                count++;
            a = b;

        }

        scanner.close();
        return count;
    }
}