package Flipkart;
import java.util.*;
public class winnergame_1823 {
    public static int ans(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (ans(n - 1, k) + k) % n;
    }

    public static int findTheWinner(int n, int k) {
        return ans(n, k) + 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int k=sc.nextInt();//2
        System.out.println(findTheWinner(n,k));//3
    }
}
