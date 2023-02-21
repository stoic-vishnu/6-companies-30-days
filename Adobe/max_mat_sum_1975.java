package Adobe;
import java.util.*;
public class max_mat_sum_1975 {
    public static long maxMatrixSum(int[][] matrix) {
        long count = 0, min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
                sum += Math.abs(matrix[i][j]);
                min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }
        if (count % 2 == 0) {
            return sum;
        } else {
            return sum - (2 * min);
        }
    }
    public static void main(String[] args) {
        int mat[][] ={{1,-1},{-1,1}};
        System.out.println("Multiply the 2 elements in the first row by -1 \nMultiply the 2 elements in the first column by -1" +"\n ANS  : "+maxMatrixSum(mat));
    }
}
