public class Object {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
        Sum()
    }

    static Object Sum(Object d, Object e) {

        if (d instanceof Double && e instanceof Double) {
            return (Object) ((Double) d + (Double) e);

        } else if (d instanceof Integer && e instanceof Integer) {
            return (Object) ((Integer) d + (Integer) e);
        } else
            return 0;
    }

}
