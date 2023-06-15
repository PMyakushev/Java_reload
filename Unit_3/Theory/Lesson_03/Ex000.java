package Lesson_03;

public class Ex000 {
   // public static void main(String[] args) {
   // int[] a = new int[] { 1, 9 }; // 2 элемента
   // int[] b = new int[3]; // Масив b состоящий из 3 чисел
   // System.arraycopy(a, 0, b, 0, a.length); // из массива а в массив b
   // скопировать данные
   // // начинай с 0 элемента и всю длину массива а

   // for (int i : a) {
   // System.out.printf("%d", i);
   // }
   // for (int j : b) {
   // System.out.printf("%d", j);
   // }
   // }

   public static void main(String[] args) {
      int[] a = new int[] { 1, 9 };

      for (int i : a) {
         System.out.printf("%d", i);
      }
      a = AddItem(a, 3);
      a = AddItem(a, 2);
      for (int j : a) {
         System.out.printf("%d", j);
      }
   }

   static int[] AddItem(int[] array, int item) {
      int length = array.length;
      int[] temp = new int[length + 1];
      System.arraycopy(array, 0, temp, 0, length);
      temp[length] = item;
      return temp;
   }

}