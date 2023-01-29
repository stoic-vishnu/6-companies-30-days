package GoldmanSachs;
import java.util.*;
public class split_arr_cons {
    public static boolean ispossible(int[] nums) {
        HashMap<Integer, Integer> fm = new HashMap<>();
        HashMap<Integer, Integer> hym = new HashMap<>();
        for (int i : nums) {
            fm.put(i, fm.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (fm.get(nums[i]) <= 0) {
                continue;
            } else if (hym.getOrDefault(nums[i], 0) > 0) {
                fm.put(nums[i], fm.getOrDefault(nums[i], 0) - 1);
                hym.put(nums[i], hym.getOrDefault(nums[i], 0) - 1);
                hym.put(nums[i] + 1, hym.getOrDefault(nums[i] + 1, 0) + 1);
            } else if (fm.getOrDefault(nums[i], 0) > 0 && fm.getOrDefault(nums[i] + 1, 0) > 0
                    && fm.getOrDefault(nums[i] + 2, 0) > 0) {
                fm.put(nums[i], fm.getOrDefault(nums[i], 0) - 1);
                fm.put(nums[i] + 1, fm.getOrDefault(nums[i] + 1, 0) - 1);
                fm.put(nums[i] + 2, fm.getOrDefault(nums[i] + 2, 0) - 1);
                hym.put(nums[i] + 3, hym.getOrDefault(nums[i] + 3, 0) + 1);
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={ 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(ispossible(nums));
    }
}
