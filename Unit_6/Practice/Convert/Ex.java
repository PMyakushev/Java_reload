package Practice.Convert;

/*
 * Напиште интерфейс Convert для конвертации из градусов по цельсию в 
 * Кельфины и Фаренгейты. У коассов наследника необходимо преопределить метод интерфейса
 * для фалидного перевода велечиню. Метод для конвертации назовите "convertValue"
 */
public class Ex {
    public static void main(String[] args) {
        double temp = 1.0;
        extracted(temp);
    }

    /**
     * @param temp - температура по цельсию
     */
    private static void extracted(double temp) {
        System.out.println("temp Cels = " + new Cels().convertValue(temp));
        System.out.println("temp Faren = " + new Faren().convertValue(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convertValue(temp));
    }   

}