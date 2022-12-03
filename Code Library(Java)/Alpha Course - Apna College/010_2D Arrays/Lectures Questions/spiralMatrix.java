public class spiralMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMat(mat);

    }

    public static void spiralMat(int mat[][]) {

        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;
        int i;

        while (top <= bottom && left <= right) {

            for (i = left; i <= right; i++) {
                System.out.print(mat[top][i]);
            }
            top++;

            for (i = top; i <= bottom; i++) {
                System.out.print(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i]);

                }
                bottom--;
            }

            if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left]);

                }
                left++;
            }
        }
    }
}
