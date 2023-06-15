package Unit_2.HomeWork;

//* Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
//Пример:
//Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
//Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
//Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
public class Tusk_03 {
    public static void main(String[] args) {

        int[] array = { 1, 22, 33, 44, 5, -5, -3, 23, -7, -22 };
        System.out.println("Дан массив");
        for (int eh : array) {
            System.out.print(eh + " ");
        }
        int[] arrayRes = SearhSumm(array);
        System.out.println("\nРезультирующий массив");
        for (int item : arrayRes) {
            System.out.print(item + " ");
        }

    }

    private static int[] SearhSumm(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 != 0 && array[i] > 0) {
                k += i;
            }
        }
        // System.out.println("\n" + k);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = k;
            }
        }

        return array;
    }

}
