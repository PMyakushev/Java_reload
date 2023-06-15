package Unit_2.Practice;

import java.util.Scanner;

/**
 * Дан массив целых чисел. Найти количество пар соседних элементов, где первый
 * элемент вдвое больше второго.
 */
public class Lesson_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("zadanie4(mass): " + zadanie4(mass));

    }

    /**
     * @param mass входящий массив
     * @return рузльтат
     * @apiNote * Дан массив целых чисел. Найти количество пар соседних элементов,
     *          где первый элемент вдвое больше второго.
     */
    private static int zadanie4(int[] mass) {
        int k = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1] * 2) {
                k++;
            }
        }
        return k;
    }

}
