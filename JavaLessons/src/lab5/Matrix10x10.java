package lab5;

public class Matrix10x10 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int number = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++,number++) {
                if (i == j) {
                    matrix[i][j] = number;
                    sum += number;

                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
