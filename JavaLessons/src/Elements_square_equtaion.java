import java.util.Scanner;

public class Elements_square_equtaion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2 + bx + c = 0");
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();
        int expression = 0;
        float x1,x2;
        if (a!=0){
            float D = (float) (Math.pow(b,2) - 4 *a*c);
            if(D<0) expression = 1;
            else if (D==0) expression=2;
            else if (D>0) expression = 3;

            switch(expression){
                case 1:
                    System.out.println("D<0");
                    break;
                case 2:
                    x1 = (-1*b)/2*a;
                    System.out.println("x1 = "+x1);
                    break;
                case 3:
                    x1 = (float)(-1*b + Math.sqrt(D))/2*a;
                    System.out.println("x1 = "+x1);
                    x2 = (float)(-1*b - Math.sqrt(D))/2*a;
                    System.out.println("x2 = "+x2);
                    break;
                default:break;
            }
        }
    }
}
