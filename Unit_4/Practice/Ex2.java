package Unit_4.Practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList : " + linkedList);
        // zadanie3(linkedList);
        zadanie4(linkedList);
    }

    private static void zadanie4(LinkedList<Integer> linkedList) {
        for (int index = linkedList.size() - 1; index >= 0; index--) {
            if (linkedList.get(index) < 0) {
                linkedList.remove(index);
                // --index;
            }

        }
        System.out.println("linkedList : " + linkedList);
    }

    // private static void zadanie3(LinkedList<Integer> linkedList) {
    // int sum = 0;
    // for (Integer element : linkedList) {
    // if (element % 2 == 0)
    // sum += element;
    // }
    // System.out.println("sum :" + sum);
    // for (int index = 0; index < linkedList.size(); index++) {
    // if (linkedList.get(index) % 3 != 0 || linkedList.get(index) == 0) {
    // linkedList.set(index, sum);
    // }
    // }
    // System.out.println("linkedListSum : " + linkedList);
    // }

    /**
     * @param n колличество элементов
     * @return новый список
     */
    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(-10, 10));
        }
        return linkedList;
    }
}