package GoldmanSachs;
import java.util.*;
public class no_boomerng {
    public static int dist(int p, int q) {
        return (p * p) + (q * q);
    }
    public static int numberboomerag(int[][] point) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < point.length; i++) {
            int[] ar = point[i];
            int p = ar[0];
            int q = ar[1];
            for (int j = 0; j < point.length; j++) {
                int[] ar1 = point[j];
                int p1 = ar1[0];
                int q1 = ar1[1];
                int d = dist(p - p1, q - q1);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int v : map.values()) {
                count += v * (v - 1);
            }
            map.clear();
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] points = {{0,0},{1,0},{2,0}};
        System.out.println(numberboomerag(points));
    }
}
