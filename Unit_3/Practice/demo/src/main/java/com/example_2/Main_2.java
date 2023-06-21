package com.example_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив объектов: фамилия студента, номер группы, размер стипендии,
 * баллы по 3 предметам. Определить стипендии студентов, фамилии которых
 * заканчиваются на «ова», при четной сумме баллов.
 */
public class Main_2 {
    public static void main(String[] args) {
        Students sudent1 = new Students("Иванов", 23, 12, List.of(3, 3, 4));
        Students sudent2 = new Students("Петрова", 13, 13, List.of(2, 4, 2));
        Students sudent3 = new Students("Жукова", 14, 14, List.of(1, 4, 6));
        Students sudent4 = new Students("Смирнова", 24, 15, List.of(5, 4, 3));
        List<Students> arrList = new ArrayList<>();
        arrList.add(sudent1);
        arrList.add(sudent2);
        arrList.add(sudent3);
        arrList.add(sudent4);

        for (Students student : arrList) {
            int sum = sumScorse(student.getCount());
            if (student.getSurName().endsWith("ова") && sum % 2 == 0) {
                System.out.println(student.getScholarshipAmount());
            }
        }
    }

    private static int sumScorse(List<Integer> count) {
        int sum = 0;
        for (Integer sumCount : count) {
            sum += sumCount;
        }
        return sum;
    }
}
