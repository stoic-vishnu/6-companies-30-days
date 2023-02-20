package Flipkart;
import java.util.*;



public class removezerosum_1171 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode removeZeroSumSublists(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode db=new ListNode(0);
        db.next=head;
        ListNode cir = head;
        int sum=0;
        while(cir!=null){
            if(cir.val+sum==0 )
                db.next=cir.next;
            sum+=cir.val;
            cir=cir.next;
        }
        if(db.next !=null)
            db.next.next=removeZeroSumSublists(db.next.next);
        return db.next;
    }
    public static void main(String[] args) {
        int[] head = {1,2,-3,3,1};
        System.out.println(removeZeroSumSublists(head));
    }
}
