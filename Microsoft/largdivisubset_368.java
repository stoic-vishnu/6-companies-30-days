package Microsoft;
import java.util.*;
public class largdivisubset_368 {
    private static int ldsize(int n[], int out[]) {
        Arrays.sort(n);
        Arrays.fill(out, 1);
        int ldsize = 1;
        for (int i = 1; i < n.length; i++) {
            for (int j = 0; j < i; j++) {
                if (n[i] % n[j] == 0) {
                    out[i] = Math.max(out[i], out[j] + 1);
                    ldsize = Math.max(ldsize, out[i]);
                }
            }
        }
        return ldsize;
    }

    private static List<Integer> ldsarr(int n[], int out[], int sz) {
        int ele = -1;
        var lds = new LinkedList<Integer>();
        for (int h = n.length - 1; h >= 0; h--) {
            if (out[h] == sz && (ele == -1 || ele % n[h] == 0)) {
                lds.addFirst(n[h]);
                sz--;
                ele = n[h];
            }
        }
        return lds;

    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        var out = new int[nums.length];
        return ldsarr(nums, out, ldsize(nums, out));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(largestDivisibleSubset(arr));
    }
}
