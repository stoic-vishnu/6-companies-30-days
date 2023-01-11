package Microsoft;
import java.util.*;
public class reverse_polish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        System.out.println(reverse_nota(str));
    }
    public static int reverse_nota(String[] str1) {
        Stack<Integer> stack = new Stack();
        String symb = "+-*/";
        for (String s : str1) {
            if (symb.contains(s) && !stack.isEmpty()) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int ans = operator(op2, s, op1);
                stack.push(ans);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();

    }

    public static int operator(int op2, String s, int op1) {
        if (s.equals("+"))
            return op2 + op1;
        else if (s.equals("-"))
            return op2 - op1;
        else if (s.equals("/"))
            return op2 / op1;
        return op2 * op1;
    }
}
