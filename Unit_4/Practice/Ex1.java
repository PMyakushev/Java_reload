package Unit_4.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }
        System.out.println("linkedList1 = " + linkedList);
        sc.close();
        System.out.println("linkedList.peek()2 = " + linkedList.peek()); // Извлекает, но не удаляет заголовок (первый
                                                                         // элемент) этого списка.
        System.out.println("linkedList3 = " + linkedList);
        System.out.println("linkedList.pop()4 = " + linkedList.pop()); // Удаляет первое вхождение указанного элемента
                                                                       // этом
        System.out.println("linkedList5 = " + linkedList);
        linkedList.push(1);
        System.out.println("linkedList6 = " + linkedList);
        linkedList.add(2);
        linkedList.addLast(3);
        linkedList.addFirst(3);
        System.out.println("linkedList7 = " + linkedList);
        System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());

        System.out.println("linkedList8 = " + linkedList);
        System.out.println("linkedList.contains(10)9 = " + linkedList.contains(10));

    }
}
