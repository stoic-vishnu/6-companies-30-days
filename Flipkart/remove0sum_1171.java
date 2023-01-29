package Flipkart;
import java.util.*;
public class remove0sum_1171 {
    public static ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode db = new ListNode(0);
        db.next = head;
        ListNode cir = head;
        int sum = 0;
        while (cir != null) {
            if (cir.val + sum == 0)
                db.next = cir.next;
            sum += cir.val;
            cir = cir.next;
        }
        if (db.next != null)
            db.next.next = removeZeroSumSublists(db.next.next);
        return db.next;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
    }
}
