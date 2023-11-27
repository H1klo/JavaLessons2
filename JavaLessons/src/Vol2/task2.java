package Vol2;

public class task2 {
    public static void main(String[] args) {
        System.out.println(calcSumArray(new int[]{5,2,3}));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        for (int i=0; i<arr.length;i++){
            result += arr[i];
        }
        return result;
    }
}
