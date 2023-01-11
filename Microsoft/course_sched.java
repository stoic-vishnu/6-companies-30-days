package Microsoft;
import java.util.*;
public class course_sched {
    public static boolean course(int num, int[][] pre) {
        int arr[] = new int[num];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < pre.length; i++) {
            arr[pre[i][0]]++;
            if (!map.containsKey(pre[i][1])) {
                List<Integer> ele = new ArrayList<>();
                ele.add(pre[i][0]);
                map.put(pre[i][1], ele);
            } else {
                map.get(pre[i][1]).add(pre[i][0]);
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0)
                q.add(j);
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            List<Integer> list = map.get(cur);
            if (list != null) {
                for (int f = 0; f < list.size(); f++) {
                    arr[list.get(f)]--;
                    if (arr[list.get(f)] == 0)
                        q.add(list.get(f));
                }
            }
        }
        for (int h : arr) {
            if (h != 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int numcours = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        System.out.println(course(numcours, prerequisites));
    }
}
