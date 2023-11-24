package lab6;

public class task1A {
    public static void main(String[] args) {


        int[] ints = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] ints2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = move(ints2);
        for (int a : ints2) {
            System.out.print(a + " ");
        }
        System.out.println(counter);

    }

    public static int move(int[] ints) {
        int counter = 0;
        boolean end = false;

        for (int i = 0; i < ints.length-1 && !end; i++) {
            counter++;
            end = true;
            for (int j = 0; j < ints.length -1-i; j++) {
                counter++;
                if (ints[j] > ints[j + 1]) {
                    end = false;
                    int temp = ints[j+1];
                    ints[j + 1] = ints[j];
                    ints[j] = temp;
                    counter++;
                }



            }

        }
        return (counter);
    }
}
