package Vol2;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        System.out.println(findBiggest(2891));
    }
    public static int findBiggest(int n){
        int result=0;

        String stringN = String.valueOf(n);
        String[] arr = new String[stringN.length()];

        for (int i =0; i<stringN.length();i++){
            arr[i]=Character.toString(stringN.charAt(i));
        }

        Arrays.sort(arr);

        for(int i = 0;i<arr.length;i++){
            result += Math.pow(10,i) * Integer.parseInt(arr[i]);
        }
        return result;
    }
}
