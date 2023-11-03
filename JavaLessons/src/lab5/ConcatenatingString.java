package lab5;

import java.util.Scanner;

public class ConcatenatingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first str: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second str: ");
        String str2 = scanner.nextLine();
        String str12 = str1.concat(str2);
        String str21 = str2.concat(str1);
        System.out.println(str12);
        System.out.println(str21);
        if(str12.compareTo(str21)==0){
            System.out.println("Same");
        }
        else {
            System.out.println("Differ");
        }
    }
}
