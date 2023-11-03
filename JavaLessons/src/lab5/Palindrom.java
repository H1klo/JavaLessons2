package lab5;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter str: ");
        String string = scanner.nextLine().toLowerCase();

        boolean finished = true;
        for (int i= 0; i<string.length()/2;i++){
            if(string.charAt(i) == string.charAt(string.length()-i-1)){}
            else {
                System.out.println("Not Palindrom");
                finished = false;
                break;}

        }
        if(finished){System.out.println("Palindrom");}
    }
}
