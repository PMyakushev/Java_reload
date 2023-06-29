package Unit_5.Practice;

import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

/**
 * Подсчитать колличество вхождений каждого симвоал в текст
 */
public class Exe1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "qweqweqwer asdasdas da ewqdasfd sde asdsa fasdf";
        extracted2(mapCh, str);
        extracted(mapCh);
    }

    private static void extracted2(Map<Character, Integer> mapCh, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                mapCh.putIfAbsent(str.charAt(i), 0);
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
                // if (!mapCh.containsKey(str.charAt(i))) {
                // mapCh.put(str.charAt(i), 1);
                // } else {
                // mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
                // }
            }
        }
    }

    private static void extracted(Map<Character, Integer> mapCh) {
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " Встретилась: " + entry.getValue() + " раз(а)");

        }
    }
}
