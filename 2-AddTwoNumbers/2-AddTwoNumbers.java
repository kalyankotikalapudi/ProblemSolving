// Last updated: 3/26/2025, 8:45:27 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   
        ListNode l3= new ListNode(0);
        ListNode current=l3;
        
        ListNode first = l1;
        ListNode second = l2;
        int carry=0;

        while(first!=null || second!=null)
        {
            int x =0; int y=0;
            
            if(first!=null){x=first.val;}else{x=0;}
            if(second!=null){y=second.val;}else{y=0;}
           
           
            int sum =carry+ x+y;
            carry= sum/10;
            sum=sum%10;
            
            current.next = new ListNode(sum);
            current=current.next;
            if(first!=null){first=first.next;}
            if(second!=null){second=second.next;}
        }


       if (carry > 0) {
        current.next = new ListNode(carry); 
       }

        
        return l3.next;
    }
}