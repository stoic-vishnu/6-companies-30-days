package GoldmanSachs;

import java.util.Scanner;
import java.util.*;

public class invalid_trans {
    public static List<String> invalidtrans(String[] tran) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < tran.length; i++) {
            String[] ar = tran[i].split(",");
            String name = ar[0];
            int tym = Integer.parseInt(ar[1]);
            int amt = Integer.parseInt(ar[2]);
            String cty = ar[3];
            if (amt > 1000) {
                ans.add(tran[i]);
                continue;
            }
            for (int j = 0; j < tran.length; j++) {
                String[] ar1 = tran[j].split(",");
                String name1 = ar1[0];
                int tym1 = Integer.parseInt(ar1[1]);
                int amt1 = Integer.parseInt(ar1[2]);
                String cty1 = ar1[3];
                if (name.equals(name1)) {
                    if (Math.abs(tym - tym1) <= 60 && !cty.equals(cty1)) {
                        ans.add(tran[i]);
                        break;
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] transaction = {"alice,20,800,mtv","alice,50,1200,mtv"};
        System.out.println(invalidtrans(transaction));

    }
}
