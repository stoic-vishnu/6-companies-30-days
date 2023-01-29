package Microsoft;
import java.util.*;
public class combinsum_216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList();
        combin(k, n, 1, new ArrayList<Integer>(), res);
        return res;

    }

    public static void combin(int k, int n, int ind, List<Integer> ans, List<List<Integer>> res) {
        if (ans.size() == k && n == 0) {
            res.add(new ArrayList<Integer>(ans));
            return;
        }
        for (int j = ind; j < 10; j++) {
            ans.add(j);
            combin(k, n - j, j + 1, ans, res);
            ans.remove(ans.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3
        int k=sc.nextInt();
        //7
        int n=sc.nextInt();
        // [[1,2,4]]
        System.out.println(combinationSum3(k,n));
    }
}
