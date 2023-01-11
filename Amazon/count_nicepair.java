import java.util.*;
public class count_nicepair {
    public static int rev(int s) {
        int rev = 0;
        while (s != 0) {
            int rem = s % 10;
            rev = rev * 10 + rem;
            s = s / 10;
        }
        System.out.println(rev);
        return rev;
    }
    public static int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int re = rev(nums[i]);
            System.out.println(re);
            int dif = nums[i] - re;
            if (!map.containsKey(dif)) {
                res += map.get(dif);
                map.put(dif, 1);
            } else {
                res += map.get(dif);
                map.put(dif, map.get(dif) + 1);
            }
        }
        System.out.println(res);
        return (int) res%1000000007;
    }
    public static void main(String[] args) {
        int[] arr={13,10,35,24,76};
        System.out.println(countNicePairs(arr));

    }
}
