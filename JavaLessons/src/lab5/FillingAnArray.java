package lab5;

public class FillingAnArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int number = 9;
        for (int i = 0; i<intArray.length ;i++){
            intArray[i] = number;
            number--;
        }
        for (int i: intArray
             ) {
            System.out.println(i);
        }


        }
    }


