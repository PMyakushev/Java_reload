package Unit_1.HomeWork;

import java.util.Scanner;

/**
 * Tusk_02
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class Tusk_02 {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("revres(): " + revres(str));
        scanner.close();
    }

    private static String revres(String str) {
        StringBuilder sb = new StringBuilder(); // создаем набор символов от (0 до 14)

        int n = str.length(), i = n - 1, j = n; // Длина нашей строки 15, поэтому мы отнимаем -1, потому что символы
                                                // идут по индексам и идут с 0

        while (i >= 0) { // пока i не будет == -1, мы будем идти

            if (str.charAt(i) == ' ') { // charAt индексы (14)
                sb.append(str.substring(i + 1, j)).append(" ");
                while (str.charAt(i) == ' ')
                    i--; // i = 9 после удаления пробела и добовления пробела
                j = i + 1; // прибавляем +1 для substring, Первая итерация substring(10, 15) Blue

            } else
                i--;
        }

        sb.append(str.substring(0, j)); // последня итерация от 0 до 3, j выходит и цикла == 3
        return sb.toString(); // конвертация sb в строку
    }

}

// the sky is blue