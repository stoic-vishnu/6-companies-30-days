package Microsoft;
import java.util.*;
public class Nosubstring3char_1358 {
    public static int numberofsubstrings(String s) {
        int freq[] = new int[4];
        int ret = 0, h = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                freq[s.charAt(h) - 'a']--;
                h++;
            }
            ret = ret + h;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //abcabc
        String str = sc.next();
        //ans = 10
        System.out.println(numberofsubstrings(str));

    }
}
    
