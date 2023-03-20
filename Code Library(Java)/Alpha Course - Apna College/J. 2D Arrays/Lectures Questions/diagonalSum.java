public class diagonalSum {

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(sum(mat));
    }

    public static int sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal (i==j)
            sum += matrix[i][i];

            // secondary diagonal (i+j==matrix ki length-1)
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
}
