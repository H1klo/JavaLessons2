package lab3;

public class Sum_Even {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<=100;i=i+2) {
        sum+=i;
        }
        System.out.println(sum);
    }
}
