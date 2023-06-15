package Unit_2.HomeWork;

import java.util.Scanner;

//* Дана последовательность N целых чисел. Найти сумму простых чисел.
//
public class Tusk_01 {
    public static void main(String[] args) {
        System.err.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.err.println("Введите целые числа для массива");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Сумма элементов = " + summNamber(array));

        scanner.close();
    }

    private static int summNamber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}