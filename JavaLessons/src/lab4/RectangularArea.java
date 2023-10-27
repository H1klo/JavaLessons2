package lab4;

import java.util.Scanner;

public class RectangularArea{
    float a,b,area;

    public RectangularArea(){
        getData();
        computeField();
        displayField();
    }
    private void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println();
        System.out.print("Enter b: ");
        b = Float.parseFloat(scanner.nextLine());
        System.out.println();
    }
    private void computeField(){
        area = this.a*this.b;
    }
    private void displayField(){
        System.out.println("The area is: "+ area);
    }


}
