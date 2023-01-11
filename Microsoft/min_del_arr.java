package Microsoft;
import java.util.*;
public class min_del_arr {
    public static int gcd(int c, int d) {
        if (c == 0)
            return d;
        return gcd(d % c, c);
    }
    public static int min_delete(int[] nums, int[] ndiv) {
        int res = ndiv[0];
        for (int i : ndiv) {
            res = gcd(res, i);
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res % nums[i] != 0)
                count++;
            else {
                break;
            }
        }
        if (count == 0)
            return -1;
        else
            return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int arr1[] = new int[nums];
        int arr2[] = new int[nums];
        for (int i = 0; i < nums; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < nums; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Minimum Deletions make arr div :" + min_delete(arr1, arr2));
    }
}
