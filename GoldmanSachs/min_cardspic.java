package GoldmanSachs;
import java.util.*;
public class min_cardspic {
    public static int mincardpick(int[] cards) {
        int count = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (!map.containsKey(cards[i]))
                map.put(cards[i], i);
            else {
                if (i - map.get(cards[i]) < count) {
                    count = i - map.get(cards[i]);
                }
                map.put(cards[i], i);
            }
        }
        if (count == Integer.MAX_VALUE)
            return -1;
        return count + 1;
    }
    public static void main(String[] args) {
        int cards[] = {3,4,2,3,4,7};
        System.out.println(mincardpick(cards));
    }   
}
