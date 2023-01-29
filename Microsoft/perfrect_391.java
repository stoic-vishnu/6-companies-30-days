package Microsoft;
import java.util.*;
public class perfrect_391 {
    public static boolean isrectangle(int[][] rect) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        if (rect.length == 0 && rect[0].length == 0)
            return false;
        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;
        for (int re[] : rect) {
            x1 = Math.min(re[0], x1);
            y1 = Math.min(re[1], y1);
            x2 = Math.max(re[2], x2);
            y2 = Math.max(re[3], y2);
            ans += ((re[2] - re[0]) * (re[3] - re[1]));
            String s1 = re[0] + " " + re[1];
            String s2 = re[0] + " " + re[3];
            String s3 = re[2] + " " + re[3];
            String s4 = re[2] + " " + re[1];
            if (!set.add(s1))
                set.remove(s1);
            if (!set.add(s2))
                set.remove(s2);
            if (!set.add(s3))
                set.remove(s3);
            if (!set.add(s4))
                set.remove(s4);
        }
        if (!set.contains(x1 + " " + y1) || !set.contains(x1 + " " + y2) || !set.contains(x2 + " " + y1)
                || !set.contains(x2 + " " + y2) || set.size() != 4) {
            return false;
        }
        return (ans == (x2 - x1) * (y2 - y1));
    }
    public static void main(String[] args) {
        int[][] rect= {{1,1,3,3},{3,1,4,2},{3,2,4,4},{1,3,2,4},{2,3,3,4}};
        System.out.println(isrectangle(rect));
    }
}
