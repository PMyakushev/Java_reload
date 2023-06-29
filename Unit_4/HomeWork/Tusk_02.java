package Unit_4.HomeWork;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли входная строка допустимой.
 * 
 * Входная строка допустима, если:
 * 
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждая закрывающаяся скобка имеет соответствующую открытую скобку того же
 * типа.
 */
public class Tusk_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобочки");
        String text1 = sc.nextLine();
        sc.close();
        System.out.println(lookString(text1));
    }

    public static boolean lookString(String s) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[')
                list.add(s.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (s.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (s.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (s.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }

}
