package HomeWork.Tusk_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены,
 * сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой
 */

public class Main_1 {
    public static void main(String[] args) {
        Product product = new Product("Product1", "Rus", 25.36, 1003, 2);
        Product product2 = new Product("Product2", "Chi", 25.36, 1005, 1);
        Product product3 = new Product("Product3", "ES", 25.36, 1001, 2);
        Product product4 = new Product("Product4", "ES", 25.36, 1001, 2);
        Product product5 = new Product("Product5", "Rus", 25.36, 1010, 1);
        Product product6 = new Product("Product6", "Chi", 25.36, 10047, 1);
        List<Product> arrProduct = new ArrayList<>();
        arrProduct.add(product);
        arrProduct.add(product2);
        arrProduct.add(product3);
        arrProduct.add(product4);
        arrProduct.add(product5);
        arrProduct.add(product6);
        Scanner sca = new Scanner(System.in);
        System.out.println("Ввдите котегорию");
        int scaType = sca.nextInt();
        Integer min = Integer.MAX_VALUE;
        List<String> nameProduct = new ArrayList<>();
        for (int i = 0; i < arrProduct.size(); i++) {

            if (arrProduct.get(i).getKind().equals(scaType)) {
                if (arrProduct.get(i).getPrice() < min) {
                    min = arrProduct.get(i).getPrice();
                    nameProduct.add(arrProduct.get(i).getNameProduct());
                }

            }

        }

        sca.close();
        System.out.println("Product : " + nameProduct + " minPrice : " + min);

    }

}