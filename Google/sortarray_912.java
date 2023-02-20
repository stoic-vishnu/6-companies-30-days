package Google;
import java.util.*;
public class sortarray_912 {
    static void merge(int[] inp) {
        int n = inp.length;
        if (inp.length < 2) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = inp[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = inp[i];
        }
        merge(left);
        merge(right);
        merge_sort(inp, left, right);
    }

    static void merge_sort(int[] inp, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                inp[k] = left[i];
                i++;
            } else {
                inp[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            inp[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            inp[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] nums={7,5,9,1,0,12};
        merge(nums);
        System.out.println(Arrays.toString(nums));
    }
}
