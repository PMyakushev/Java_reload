package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Дан массив чисел процент уникальных чиселю
 * *Процент уникальны чисел = колличество уникальных чисел * 100 / общее
 * количество в массиве
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        HashSet<Integer> arrayUnique = new HashSet<>(array);
        // for (Integer element : array) {
        // arrayUnique.add(element);
        // }
        System.out.println(array);
        System.out.println(arrayUnique);
        System.out.println(arrayUnique.size() * 100 / array.size() + "%");
    }
}