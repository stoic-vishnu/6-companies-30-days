package GoldmanSachs;
import java.util.*;

public class valid_sqre {
    public static int distance(int x1, int y1, int x2, int y2) {
        int x = (int) Math.pow((y1 - x1), 2);
        int y = (int) Math.pow((y2 - x2), 2);
        return x + y;
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        int pt1 = distance(p1[0], p2[0], p1[1], p2[1]);
        set.add(pt1);
        int pt2 = distance(p2[0], p3[0], p2[1], p3[1]);
        set.add(pt2);
        int pt3 = distance(p3[0], p4[0], p3[1], p4[1]);
        set.add(pt3);
        int pt4 = distance(p4[0], p1[0], p4[1], p1[1]);
        set.add(pt4);
        int pt5 = distance(p1[0], p3[0], p1[1], p3[1]);
        set.add(pt5);
        int pt6 = distance(p2[0], p4[0], p2[1], p4[1]);
        set.add(pt6);
        if (set.size() == 2 && !set.contains(0)) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        int[] p1 = {0,0};
        int[] p2 = {1,1};
        int[] p3 = {1,0};
        int[] p4 = {0,1};
        System.out.println(validSquare(p1,  p2, p3, p4));
    }   
}
