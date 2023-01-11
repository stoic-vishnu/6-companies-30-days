package Microsoft;
import java.util.*;
public class aeroplane {
    public static double nthseat(int n) {
        if (n == 1)
            return 1;
        double res = 1.0 / 2.0;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nthseat(n));
    }
}
