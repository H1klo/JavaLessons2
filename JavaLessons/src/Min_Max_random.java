import java.util.Random;

public class Min_Max_random {
    public static void main(String[] args) {
        int min=101,max=0,temp,i=0;
        Random random = new Random();

         while(i<=10){

             temp = random.nextInt(1,100);
             System.out.print(temp+ ", ");
             if (temp<min ) min = temp;
             else if (temp>max) max = temp;

             i++;
         }
        System.out.println();
        System.out.println("min = " + min +" max = " + max);
    }

}
