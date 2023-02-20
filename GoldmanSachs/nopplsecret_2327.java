package GoldmanSachs;
import java.util.*;
//Time complxity o(n) runs in 3ms.
public class nopplsecret_2327 {
    public static int peopleAwareOfSecret(int n, int d, int f) {
        long ans = 0, share = 0;
        long[] res = new long[n + 1];
        res[1] = 1;
        long mod = (long) (1e9 + 7);
        for (int i = 2; i < n + 1; i++) {
            long newshare = res[Math.max(i - d, 0)];
            long forgetsec = res[Math.max(i - f, 0)];
            share += (newshare - forgetsec + mod) % mod;
            res[i] = share;
        }
        // System.out.println (Arrays.toString(res));
        for (int m = n - f + 1; m < n + 1; m++) {
            ans = (ans + res[m]) % mod;
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//6
        int delay=sc.nextInt();//2
        int forget=sc.nextInt();//4
        System.out.println(peopleAwareOfSecret( n, delay, forget));
        //5
    }
}
