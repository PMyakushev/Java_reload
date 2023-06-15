package Unit_2.HomeWork;

import java.util.Scanner;

//* Дана последовательность из N целых чисел. 
//Верно ли, что последовательность является возрастающей.. 
public class Tusk_02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите последовательность чисел");
        for (int index = 0; index < size; index++) {
            array[index] = scanner.nextInt();
        }
        System.out.println("Вывод массива");
        for (int index = 0; index < array.length; index++) {
            System.out.printf(" " + array[index]);
        }
        System.out.println();
        scanner.close();
        System.out.println("growingSequence(array[]) :" + growingSequence(array));
    }

    /**
     * @param array
     * @return
     */
    private static boolean growingSequence(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                return false;
            }
        }
        return true;
    }
}
