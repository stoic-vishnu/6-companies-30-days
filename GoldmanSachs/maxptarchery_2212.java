package GoldmanSachs;
import java.util.*;
public class maxptarchery_2212 {
    static int bobmax[] = new int[12];
    static int maxpt = 0;

    public static int[] maximumBobPoints(int arrow, int[] alice) {
        int[] bob = new int[12];
        calcultept(arrow, alice, bob, 11, 0);
        return bobmax;
    }

    public static void calcultept(int ar, int[] ali, int[] bob, int maxindx, int pts) {
        if (maxindx < 0 || ar <= 0) {
            if (ar > 0)
                bob[0] += ar;
            if (pts > maxpt) {
                maxpt = pts;
                bobmax = bob.clone();
            }
            return;
        }
        if (ar >= (ali[maxindx] + 1)) {
            bob[maxindx] = ali[maxindx] + 1;
            calcultept(ar - (ali[maxindx] + 1), ali, bob, maxindx - 1, pts + maxindx);
            bob[maxindx] = 0;
        }
        calcultept(ar, ali, bob, maxindx - 1, pts);
        bob[maxindx] = 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrow=sc.nextInt();//9
        int[] alice = { 1, 1, 0, 1, 0, 0, 2, 1, 0, 1, 2, 0 };
        System.out.println(Arrays.toString(maximumBobPoints(arrow, alice)));
        //ans - [0,0,0,0,1,1,0,0,1,2,3,1]
    }
}
