package Google;
import java.util.*;
public class maxconsfloor_2274 {
    public static void main(String[] args) {
        int bottom = 2, top = 9; int[]spe = {4,6};
        Arrays.sort(spe);
        int d1 = spe[0] - bottom;
        int d2 = top - spe[spe.length - 1];
        int ans = Math.max(d1, d2);
        for (int i = 1; i < spe.length; i++) {
            ans = Math.max(spe[i] - spe[i - 1] - 1, ans);
        }
        System.out.println(ans);//3
    }   
}
