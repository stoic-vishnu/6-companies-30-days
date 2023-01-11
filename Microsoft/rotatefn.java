package Microsoft;
import java.util.*;
public class rotatefn {
    public static int rotatefunct(int[] nums) {
        int max = 0, ans = 0, sum = 0;
        int h = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans += nums[i] * i;
        }
        for (int j = nums.length - 1; j > 0; j--) {
            // max = formula(ans, sum, nums.length, nums[j]);
            int m = 0;
            m = ans + sum - nums.length * nums[j];
            max = Math.max(max, m);
            ans = m;
            // return max;

        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Max Rotate Fn : "+rotatefunct(arr1));

    }
}
