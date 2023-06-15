package Unit_2.Practice.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3); // создали обьект Vector и в каждое его значение положили цифру
        Vector vector2 = new Vector(1, 1, 1);

        System.out.println(vector1);
        System.out.println(vector2);

        System.out.println("vector2.vectorLength() :" + vector2.vectorLength());
        System.out.println("vector1.vectorLength() :" + vector1.vectorLength());

        System.out.println("vector1.scalarMulti(vector2) :" + vector1.scalarMulti(vector2));
        System.out.println("vector1.summa(vector2) :" + vector1.summa(vector2));
        System.out.println("vector1.vecrotCos(vector2) :" + vector1.vecrotCos(vector2));
        System.out.println("vector1.sumanddifference() :" + vector1.suma(vector2));
        System.out.println("vector1.sumanddifference() :" + vector1.difference(vector2));

        // Unit_2.Practice.Vector.Vector@1f32e575 -
        // @1f32e575 Хеш код в памяти
        // System.out.println(vector.x + " dsa "); // Вывод 1

    }
}
