package Flipkart;
import java.util.*;
public class clseprime_2523 {
    public static int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] bool = new boolean[right + 1];
        int[] res = { -1, -1 };
        int min = Integer.MAX_VALUE;
        Arrays.fill(bool, true);
        for (int i = 2; i <= right; i++) {
            if (bool[i])
                if (i >= left) {
                    list.add(i);
                }
            for (int j = i + i; j <= right; j += i) {
                bool[j] = false;
            }
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) < min) {
                min = list.get(i) - list.get(i - 1);
                res[0] = list.get(i - 1);
                res[1] = list.get(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left=sc.nextInt();//10
        int right=sc.nextInt();//19
        System.out.println(Arrays.toString(closestPrimes(left,right)));
        //[11,13]
    }
}
