package lab3;

import java.util.Scanner;

public class BMI_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter weight");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("enter height IN CM");
        float height = Float.parseFloat(scanner.nextLine())/100;
        float BMI = (float) (weight/Math.pow(height,2));
        System.out.println("your BMI is: "+ BMI);
        if (BMI<=16.0) System.out.println("starvation");
        else if (BMI<17.0) System.out.println("emaciation");
        else if (BMI<18.5) System.out.println("underweight");
        else if (BMI<22.3) System.out.println("normal,low range");
        else if (BMI<25.0) System.out.println("normal, high range");
        else if (BMI<27.5) System.out.println("overweight, low range");
        else if (BMI<30.0) System.out.println("overweight, high range");
        else if (BMI<35.0) System.out.println("1st degree obesity");
        else if (BMI<40.0) System.out.println("2st degree obesity");
        else if (BMI>=40) System.out.println("3st degree obesity");

            



    }
}
