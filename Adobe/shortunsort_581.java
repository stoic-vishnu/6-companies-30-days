package Adobe;
import java.util.*;
public class shortunsort_581 {
    public static int findUnsortedSubarray(int[] nums) {
        int st = 0, end = 0;
        int out[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            out[i] = nums[i];
        }
        Arrays.sort(out);
        // System.out.println(Arrays.toString(out));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != out[j]) {
                st = j;
                // System.out.println(st);
                break;
            }

        }
        // System.out.println(st);
        for (int h = nums.length - 1; h > 0; h--) {
            if (nums[h] != out[h]) {
                end = h;
                // System.out.println(end);
                break;
            }
        }
        System.out.println(end);
        if (end == 0 & st == 0) {
            return 0;
        } else {
            int ans = (end - st) + 1;
            return ans;
        }

        // System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
