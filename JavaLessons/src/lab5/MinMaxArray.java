package lab5;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i=0;i<ints.length;i++
             ) {
            ints[i] = random.nextInt(100);
        }
        int min=101;
        int max =0;
        for (int i:ints
             ) {
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
            System.out.println(i);
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
