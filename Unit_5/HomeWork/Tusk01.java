package Unit_5.HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1) Подсчитать количество искомого слова, через map (наполнением значение, где
 * искомое слово будет являться ключом), вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)
 */
public class Tusk01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите искомое слово с маленькой буквы");
        String wordfind = sc.nextLine();
        String str = "Россия россия россия идет вперед всей планеты. Планета — это не Россия";
        Map<String, Integer> word = new HashMap<>();
        String str1 = str.replaceAll("\\.", " ");
        String str2 = str1.toLowerCase();
        String[] strword = str2.split(" ");
        for (int i = 0; i < strword.length; i++) {
            if (strword[i].equals(wordfind)) {
                if (!word.containsKey(strword[i])) {
                    word.put(strword[i], 1);
                } else {   
                    word.put(strword[i], word.get(strword[i]) +1);
                }
            }
        }
        

        word.entrySet().stream()
                .forEach(System.out::println);
    }
}
