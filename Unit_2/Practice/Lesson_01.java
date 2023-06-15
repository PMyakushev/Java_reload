package Unit_2.Practice;

public class Lesson_01 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 5, 6, 2 };
        System.out.println("palindrom(arr) :" + palindrom(arr));
    }

    /**
     * @param arr
     * @return
     */
    private static boolean palindrom(int[] arr) {
        int len = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[len - i])
                return false;

        }
        return true;
    }

}
