package Unit_1.Practice;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * Lesson_01
 */
public class Lesson_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductSum(n) = " + subtractProductSum(n));
        scanner.close();
    }

    /**
     * @apiNone Заданое целое число возвращает разность между произведением его цифр
     *          на сумму его цифр.n
     * @param n входящее число
     * @return возвращаемое значение
     */
    private static int subtractProductSum(int n) {
        int sum = 0, pr = 1;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;

        }
        return pr - sum;
    }

}