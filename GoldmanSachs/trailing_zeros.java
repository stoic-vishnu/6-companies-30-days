package GoldmanSachs;
import java.util.*;
public class trailing_zeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans = 0;
        while (n >= 5) {
            n /= 5;
            ans += n;
        }
        System.out.println(ans);
    }
}
