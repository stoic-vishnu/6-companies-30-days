package Flipkart;
import java.util.*;
public class topKfreq_692 {
    public static List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        System.out.println(map);
        ArrayList<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);
        list.sort((x, y) -> map.get(y) - map.get(x));
        // Collections.sort(list,(x,y)->x.getValue().compareTo(y.getValue()));
        System.out.println(list);
        List ans = list.subList(0, k);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = sc.nextInt();//2
        System.out.println(topKFrequent(words,k));
    }
}
