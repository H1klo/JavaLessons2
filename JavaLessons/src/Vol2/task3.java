package Vol2;

public class task3 {
    public static void main(String[] args) {
        int[] result = createArray(21);

        for (int a:result
             ) {
            System.out.print(a + " ");
        }
    }
    public static int[] createArray(int n){
        int [] result = new int[n];
        int b = 1;
        if(n%2!=0){
            result[n-1] = 0;
            n = n-1;
        }
        for(int a = 0;a<n;a=a+2){
            result[a] = b;
            result[a+1]=-b;
            b++;
        }
        return result;
    }
}
