package Unit_5.Practice;

import java.util.HashMap;
import java.util.Map;

public class Exe2 {
    // 2) Определить есть ли в массиве дубликаты, если найден хоть оди, вывести на
    // экран (true)
    // В противном случае (false)
    public static void main(String[] args) {
        int[] array = { 1, 2, 5, 4, 6 };
        extracted(array);
    }

    /**
     * @param array Передаем массив,
     * @return boolen true or folse if array сontains duplicates
     */
    private static void extracted(int[] array) {
        Map<Integer, Integer> mapCh = new HashMap<>();
        Boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (mapCh.containsKey(array[i])) {
                flag = true;
                break;
            } else {
                mapCh.put(array[i], 1);
            }
        }
        System.out.println(flag);
    }
}

public class MapUtil {
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}