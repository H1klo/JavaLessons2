package Vol2;

public class task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("a"));
        System.out.println(repFirstChar("z"));
        System.out.println(repFirstChar("A"));
        System.out.println(repFirstChar("Z"));
        System.out.println(repFirstChar("0"));
        System.out.println(repFirstChar("9"));
    }
    public static String repFirstChar(String s){
        char c = s.charAt(0);
        if(c>=65 && c<=90){
            return "upper";
        }
        else if(c>=97 && c<=122){
            return "lower";
        }
        else if(c>=48 && c<=57){
            return "digit";
        }
        else{
            return "other";
        }
    }
}
