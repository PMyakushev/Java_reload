package Practice;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Найти пересечение слов в массивах и указать их общее колличество.
 * Mas1 = ["qwe", "asd", "qwe", "x"]
 * Mas2=["qwe", "v"]
 * Результат
 * qwe = 3;
 */
public class Ex3 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> list2 = new ArrayList<>(Arrays.asList("qwe", "v", "asd"));
        exThree(list1, list2);
    }

    /**
     * @param list1
     * @param list2
     */
    private static void exThree(List<String> list1, List<String> list2) {
        list2.retainAll(list1);
        if (list2.isEmpty()){
            System.out.println("Пересечений нет");
            return;
        }      
        System.out.println("list2: " + list2);
        for (String s : list2) {
            int i = 1;
            for (String e : list1) {
                if (s.equals(e))
                    i++;
            }
            System.out.println(s + " = " + i);
        }
    }
}