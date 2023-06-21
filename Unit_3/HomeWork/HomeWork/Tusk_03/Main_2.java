package HomeWork.Tusk_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и
 * количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора
 * содержит «А» и год издания после 2010 г, включительно.
 */
public class Main_2 {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Война и мир", "Толстой", 1200, 1876, 157);
        Cinema cinema1 = new Cinema("Мастер и Маргарита", "Булгаков", 1200, 2010, 199);
        Cinema cinema2 = new Cinema("Преступление и наказание", "Достоевский", 1200, 2011, 199);
        Cinema cinema3 = new Cinema("Маленький принц", "Антуан де Сент-Экзюпери", 1200, 2023, 197);
        Cinema cinema4 = new Cinema("Евгений Онегин", "Пушкин", 1200, 1999, 125);
        Cinema cinema5 = new Cinema("Расказы", "Чехов", 1200, 1865, 197);
        Cinema cinema6 = new Cinema("Мертвые души", "Гоголь", 1200, 1785, 151);
        Cinema cinema7 = new Cinema("Три товарища", "Эрих Мария Ремарк", 1200, 1824, 125);
        Cinema cinema8 = new Cinema("Приключения Тома Сойера", "Марк Твен", 1200, 2015, 125);
        Cinema cinema9 = new Cinema("Три Мушкетера", "Александр Дюма", 1200, 2020, 127);

        List<Cinema> arrCinema = new ArrayList<>();
        arrCinema.add(cinema);
        arrCinema.add(cinema1);
        arrCinema.add(cinema2);
        arrCinema.add(cinema3);
        arrCinema.add(cinema4);
        arrCinema.add(cinema5);
        arrCinema.add(cinema6);
        arrCinema.add(cinema7);
        arrCinema.add(cinema8);
        arrCinema.add(cinema9);

        StringBuilder sortedBooks = new StringBuilder();
        for (Cinema books : arrCinema) {
            if (Prime(books.getSummPages()) && books.getNameArtist().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getNameCinema()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean Prime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
