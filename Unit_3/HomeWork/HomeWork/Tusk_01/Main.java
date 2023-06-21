package HomeWork.Tusk_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название
 * которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Market product = new Market("Сопа Высший", 19000, 2);
        Market product1 = new Market("Кит", 1250, 1);
        Market product2 = new Market("Высший Пелядь", 1300, 1);
        Market product3 = new Market("Касатка", 1350, 2);
        Market product4 = new Market("Кета Высший", 1200, 2);
        Market product5 = new Market("Высший Мойва", 1300, 1);
        List<Market> arrMarkets = new ArrayList<>();
        arrMarkets.add(product);
        arrMarkets.add(product1);
        arrMarkets.add(product2);
        arrMarkets.add(product3);
        arrMarkets.add(product4);
        arrMarkets.add(product5);
        System.out.println("Введите сорт продукта");
        Scanner sca = new Scanner(System.in);
        Integer typeProduct = sca.nextInt();
        List<String> allProduct = new ArrayList<>();
        Integer max = 0;
        for (int i = 0; i < arrMarkets.size(); i++) {
            if (arrMarkets.get(i).getProduct().indexOf("Высший") >= 0) {
                if (arrMarkets.get(i).getKind().equals(typeProduct)) {

                    if (arrMarkets.get(i).getPrice() > max) {
                        max = arrMarkets.get(i).getPrice();
                    }
                    allProduct.add(arrMarkets.get(i).getProduct());
                }
            }

        }
        sca.close();
        System.out.println("allProduct : " + allProduct);
        System.out.println("max : " + max);
    }
}
