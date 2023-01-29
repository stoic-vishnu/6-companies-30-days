package Microsoft;
import java.util.*;
public class mindel_2344 {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static int minpperation(int[] nums, int[] numsdiv) {
        int g = numsdiv[0];
        for (int i = 1; i < numsdiv.length; i++) {
            g = gcd(g, numsdiv[i]);
        }
        Arrays.sort(nums);
        int del = 0;
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] != 0) {
                del++;
            } else {
                break;
            }
        }
        if (del == nums.length)
            del = -1;
        return del;
    }
    public static void main(String[] args) {
        int[]nums = {2,3,2,4,3},numsdivide = {9,6,9,3,15};
        System.out.println(minpperation(nums,numsdivide));
    }
}
