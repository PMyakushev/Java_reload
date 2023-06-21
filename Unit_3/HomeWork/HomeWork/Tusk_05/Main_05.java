package HomeWork.Tusk_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * при входном массиве, вернуть массив массивов со всеми перестановками его
 * элементов. (со звездочкой)
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Main_05 {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4); // Фиксированный список
        List<List<Integer>> outputList = getPermutations(inputList); // список списков
        System.out.println(outputList); // вывод списка списков
    }

    public static <T> List<List<T>> getPermutations(List<T> inputList) {
        List<List<T>> outputList = new ArrayList<>();
        generatePermutations(new ArrayList<>(inputList), 0, outputList);
        return outputList;
    }

    private static <T> void generatePermutations(List<T> currentList, int index, List<List<T>> outputList) {
        if (index == currentList.size() - 1) {
            outputList.add(new ArrayList<>(currentList));
        } else {
            for (int i = index; i < currentList.size(); i++) {
                Collections.swap(currentList, i, index);
                generatePermutations(currentList, index + 1, outputList);
                Collections.swap(currentList, i, index);
            }
        }
    }
}
