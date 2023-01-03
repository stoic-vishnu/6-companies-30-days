import java.util.*;
public class hpy_prefix {
    public static String longestPrefix(String str) {
        int out[] = new int[str.length()];
        int tot_len = 0, point = 1;
        out[0] = 0;
        while (point < str.length()) {
            if (str.charAt(point) == str.charAt(tot_len)) {
                tot_len++;
             out[point] = tot_len;
                point++;
            } else {
                if (tot_len != 0)
                    tot_len = out[tot_len - 1];
                else {
                 out[point] = 0;
                    point++;
                }
            }
        }
        return str.substring(0, out[str.length() - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPrefix(str));
    }
}
