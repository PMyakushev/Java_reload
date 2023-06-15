public class API_STRING {
    // public static void main(String[] args) {
    // String str = "";
    // for (int i = 0; i < 1_000_000; i++) {
    // str += "+";
    // }
    // System.out.println(str);
    // }

    // public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 1_000_000; i++) {
    // sb.append("+");
    // }
    // System.out.println(sb);

    // }

    // public static void main(String[] args) {
    // var s = System.currentTimeMillis();
    // // String str = "";
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 1_000_000; i++) {
    // // str += "+";
    // sb.append("+");
    // }
    // System.out.println(System.currentTimeMillis() - s);
    // // System.out.println(str);
    // // System.out.println(sb);
    // }
    public static void main(String[] args) {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
    }
}
