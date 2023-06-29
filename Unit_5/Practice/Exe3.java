package Unit_5.Practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 1)
 * ввод: s = 'LVIII'
 * вывод: 58
 * разбор: L = 50, V= 5, III = 3
 * 2)
 * ввод: s = 'MCMXCIV'
 * вывод: 1994
 * разбор: M = 1000, CM = 900, XC = 90 and IV = 4
 */
public class Exe3 {
    public static void main(String[] args) {
        String str = "LVIII";
        int summ = extracted2(str);
        System.out.println(summ);

    }

    private static int extracted2(String str) {
        Map<Character, Integer> arrayNum = new HashMap<>();
        extracted(arrayNum);
        int summ = arrayNum.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (arrayNum.containsKey(str.charAt(i))) {
                if (arrayNum.get(str.charAt(i)) < arrayNum.get(str.charAt(i + 1))) {
                    summ -= arrayNum.get(str.charAt(i));

                } else {
                    summ += arrayNum.get(str.charAt(i));
                }
            }
        }
        return summ;
    }

    private static void extracted(Map<Character, Integer> arrayNum) {
        arrayNum.put('I', 1);
        arrayNum.put('V', 5);
        arrayNum.put('X', 10);
        arrayNum.put('L', 50);
        arrayNum.put('C', 100);
        arrayNum.put('D', 500);
        arrayNum.put('M', 1000);
    }
}
