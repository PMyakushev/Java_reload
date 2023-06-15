package Unit_1.Practice;

import java.util.Scanner;

/*
 * 
 */
public class Lesson_03 {
    public static void main(String[] args) {
        System.out.println("Дана строка: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("tuskthre(str) = " + tuskthre(str));
        scanner.close();

    }

    private static String tuskthre(String str) {
        String up = str.substring(0, str.length() / 2);
        String down = str.substring(str.length() / 2);
        return down + up;
    }
}
