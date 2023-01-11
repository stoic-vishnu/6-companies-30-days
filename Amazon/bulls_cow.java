import java.util.*;
public class bulls_cow {
    public static String secr_gues(String s, String g) {
        int freq[] = new int[10];
        int bul = 0, cow = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == g.charAt(i))
                bul++;
            freq[s.charAt(i) - '0']++;
        }
        for (int j = 0; j < g.length(); j++) {
            if (freq[g.charAt(j) - 48] != 0) {
                cow++;
                freq[g.charAt(j) - '0'] -= 1;
            }
        }
        int ans = cow - bul;
        // System.out.println(bul + "A" + String.valueOf(ans) + "B");
        return (bul + "A" + String.valueOf(ans) + "B");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        System.out.println(secr_gues(str,str1));
    }
}
