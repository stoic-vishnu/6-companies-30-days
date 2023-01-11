import java.util.*;
public class no_substring_contin {
        public static int numberOfSubstrings(String s) {
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
        String str = sc.next();
        System.out.println(numberOfSubstrings(str));
    }
    }
}
