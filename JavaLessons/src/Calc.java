import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float firstNumber = Float.parseFloat(scanner.nextLine()) ;
        System.out.println("Enter the second number");
        float secondNumber =Float.parseFloat(scanner.nextLine()) ;

        System.out.println(firstNumber +" + "+secondNumber+" = "+ (firstNumber+secondNumber));
        System.out.println(firstNumber + " - "+secondNumber+" = "+ (firstNumber-secondNumber));
        System.out.println(firstNumber+" * "+secondNumber+" = "+ (firstNumber*secondNumber));
        System.out.println(firstNumber+" / "+secondNumber+" = "+ (firstNumber/secondNumber));
    }
}
