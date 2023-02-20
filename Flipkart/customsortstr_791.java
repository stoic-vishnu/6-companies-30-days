package Flipkart;
import java.util.*;
public class customsortstr_791 {
    public static String customSortString(String order, String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        String res = "";

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if (!hm.containsKey(ch))
                continue;
            int freq = hm.get(ch);
            for (int j = 0; j < freq; j++)
                res += Character.toString(ch);
            hm.remove(ch);
        }

        for (Character key : hm.keySet()) {
            int freq = hm.get(key);
            for (int j = 0; j < freq; j++)
                res += Character.toString(key);
        }
        return res;
    }
    public static void main(String[] args) {
        String order="cba";
        String s="abcd";
        System.out.println(customSortString(order, s));//cbad
    }
}
