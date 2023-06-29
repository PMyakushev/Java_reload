package Unit_5.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Tusk02 {
        public static void main(String[] args) {
        String listName = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " + "Анна Крутова " +
                "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " + "Мария Федорова "
                + "Марина Светлова " +
                "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " + "Иван Мечников "
                + "Петр Петин, Иван Ежов ";
        Map<String, Integer> nameMap = extracted2(listName);
        extracted(nameMap);
    }

    private static Map<String, Integer> extracted2(String listName) {
        Map<String, Integer> nameMap = new HashMap<>();
        String[] listNameSp = listName.split(" ");
        for (int i = 0; i < listNameSp.length; i++) {
            if (!nameMap.containsKey(listNameSp[i])) {
                nameMap.put(listNameSp[i], 1);
            } else {
                nameMap.put(listNameSp[i], nameMap.get(listNameSp[i]) + 1);
            }
        }
        return nameMap;
    }

    private static void extracted(Map<String, Integer> nameMap) {
        nameMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

