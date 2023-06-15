package Unit_2.Practice;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся
 * на 5, перед которыми идет четное число.
 */
public class Lesson_03 {

    public static void main(String[] args) {
        System.out.println("Введите длину последовательности ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) : " + zadanie2(n, scanner));

    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму
     *          чисел,оканчивающихся на 5, перед которыми идет четное число.
     * @param n       длина последовательности
     * @param scanner вспомогающий склад
     * @return сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int zadanie2(int n, Scanner scanner) {
        int sum = 0;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) {
                sum += n2;
            }
            n1 = n2;
        }
        scanner.close();
        return sum;

    }

}