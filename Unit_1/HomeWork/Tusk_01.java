package Unit_1.HomeWork;

import java.util.Scanner;

/**
 * Tusk_01
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму
 * положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */
public class Tusk_01 {

    public static void main(String[] args) {

        System.out.println("Введите ко-во чисел :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("arrayList(n, scanner): " + arrayList(n, scanner));
    }

    private static int arrayList(int n, Scanner scanner) {
        int sum = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        while (n - 2 >= 0) {
            b = scanner.nextInt();
            if (a < 0) {
                a = b;
            } else if (b < 0) {
                sum += a;
            }
            a = b;
            n--;

        }
        scanner.close();
        return sum;

    }

}
