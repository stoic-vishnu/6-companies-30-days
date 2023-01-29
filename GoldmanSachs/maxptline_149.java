package GoldmanSachs;
import java.util.*;
public class maxptline_149 {
    public static int maxpoint(int[][] arr) {
        int n = arr.length;
        if (n <= 2)
            return n;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            HashMap<Double, Integer> angle = new HashMap<>();
            for (int j = 0; j < n; j++) {
                double dy = (double) (arr[j][1] - arr[i][1]);
                double dx = (double) (arr[j][0] - arr[i][0]);
                double theta = Math.atan(dy / dx);
                angle.put(theta, angle.getOrDefault(theta, 0) + 1);
                max = Math.max(max, angle.getOrDefault(theta, 0));
            }
            res = Math.max(res, max + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
       System.out.println(maxpoint(points));
       //ans =3
    }
    
}
