package GoldmanSachs;
import java.util.*;
public class ipo_502 {
    public static int findmaxcapital(int k, int w, int[] profit, int[] capital) {
        if (profit == null && profit.length == 0)
            return w;
        PriorityQueue<Integer> mincap = new PriorityQueue<>((a, b) -> (capital[a] - capital[b]));
        PriorityQueue<Integer> maxpro = new PriorityQueue<>((a, b) -> (profit[b] - profit[a]));

        for (int i = 0; i < profit.length; i++) {
            mincap.add(i);
        }
        for (int j = 0; j < k; j++) {
            while (!mincap.isEmpty() && w >= capital[mincap.peek()]) {
                maxpro.add(mincap.poll());
            }
            if (maxpro.isEmpty())
                break;
            w += profit[maxpro.poll()];
            // System.out.println(w);
        }
        return w;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("K value :");
        int k= sc.nextInt();
        int w=0;
        int[] profit={1,2,3}, capital = {0,1,1};
        System.out.println("Max Capital value : "+findmaxcapital(k,w,profit,capital));
    }
}
