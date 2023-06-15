package Unit_2.Practice;

import java.util.Scanner;

public class Lesson_02 {
    public static void main(String[] args) {
        System.out.println("Введите число элементов массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resArr = numersSum(array);

        for (int item : resArr) {
            System.out.print(item + " ");
        }
        scanner.close();
    }

    /**
     * @apiNote Задан массив . Мы определяем промежуточную сумму массива
     *          как .numersSum[i] = sum(nums[0]...nums[1])
     * @param array массив чисел
     * @return массив чисел
     */
    private static int[] numersSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
