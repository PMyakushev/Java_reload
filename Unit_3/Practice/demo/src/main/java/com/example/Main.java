
package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Даны сведения об экспортируемых товарах: указывается наименование
 * товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
 * Найти
 * страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объемего
 * экспорта.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        List<Items> itemsList = generationCollection(n, sca);
        System.out.println("itemsList : " + itemsList);
        String searchname = sca.nextLine();
        Integer sumVolume = 0; // сумма товаров
        List<String> country = new ArrayList<>(); // Массив для хранение стран (коллекция)
        for (int index = 0; index < itemsList.size(); index++) {
            if (itemsList.get(index).getName().equals(searchname)) { // обращаемся к массиву i , и ищем где Name =
                sumVolume += itemsList.get(index).getVolume();
                country.add(itemsList.get(index).getCountry());
            }
        }
        System.out.println("country : " + country);
        System.out.println("sumVolume : " + sumVolume);
    }

    private static ArrayList<Items> generationCollection(int n, Scanner sca) {
        ArrayList<Items> colection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d элемент: ", i);
            Items item = new Items();
            item.setName(sca.nextLine());
            item.setName(sca.nextLine());
            item.setCountry(sca.nextLine());
            item.setVolume(sca.nextInt());
            colection.add(item);
        }
        sca.close();
        return colection;
    }
}
