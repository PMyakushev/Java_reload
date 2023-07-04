package HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

/*
* Задание на дом :
• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class NoteBook {
    public static void main(String[] args) {
        ClassNoteBook Not1 = new ClassNoteBook("MateBook D 16 16", 1936330, "Huawei");
        Not1.setColor("black");
        Not1.setHDD(512);
        Not1.setOS("Windows");
        Not1.setRAM(8);

        ClassNoteBook Not2 = new ClassNoteBook("MacBook Air A2681, 13.6", 1854965, "Apple");
        Not2.setColor("gray");
        Not2.setHDD(1000);
        Not2.setOS("Mac OS");
        Not2.setRAM(16);

        ClassNoteBook Not3 = new ClassNoteBook("Digma EVE 15 C423, 15.6", 1933330, "Digma");
        Not3.setColor("gray");
        Not3.setHDD(512);
        Not3.setOS("Windows");
        Not3.setRAM(16);

        ClassNoteBook Not4 = new ClassNoteBook("255 G8, 15.6", 1783763, "HP");
        Not4.setColor("white");
        Not4.setHDD(1000);
        Not4.setOS("Linux");
        Not4.setRAM(8);

        ClassNoteBook Not5 = new ClassNoteBook("VivoBook A571GT-BQ937", 1840167, "ASUS");
        Not5.setColor("red");
        Not5.setHDD(256);
        Not5.setOS("Windows");
        Not5.setRAM(4);

        HashSet<ClassNoteBook> noteBook = new HashSet<>(Arrays.asList(Not1, Not2, Not3, Not4, Not5));
        HashSet<ClassNoteBook> resalt = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer console = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (console != 5) {
            if (console == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (console == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (console == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (console == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        console = sc.nextInt();
        sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = noteBook.iterator();
                while (it.hasNext()) {
                    ClassNoteBook lap = (ClassNoteBook) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        resalt.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = noteBook.iterator();
                while (it.hasNext()) {
                    ClassNoteBook lap = (ClassNoteBook) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        resalt.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = noteBook.iterator();
                while (it.hasNext()) {
                    ClassNoteBook lap = (ClassNoteBook) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        resalt.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = noteBook.iterator();
                while (it.hasNext()) {
                    ClassNoteBook lap = (ClassNoteBook) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        resalt.add(lap);
                    }
                }
            }
        }

        Iterator it = resalt.iterator();
        while (it.hasNext()) {
            ClassNoteBook lap = (ClassNoteBook) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        sc.close();
    }
}