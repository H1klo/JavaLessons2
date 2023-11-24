package lab8;

public class Exceptions {
   public static void exc() {
       try {
           int a = 8 / 0;
       } catch (ArithmeticException e) {
           System.out.println(e);
       } finally {
           System.out.println("finally statement");
       }

       try {
           int[] a = new int[3];
           a[8] = 111;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("index");
       } finally {
           System.out.println("Finally statement");
       }
   }
}
