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
    public int pairSum(ListNode head) {

      if(head==null){return 0;}
    
     ListNode fast=head;
     ListNode slow=head;

     while(fast!=null && fast.next!=null)
     {
          slow = slow.next;
          fast=fast.next.next;
     }

    ListNode newhead=slow;
    ListNode prev=null;
    ListNode front =null;


   while (newhead != null) 
   {
      front = newhead.next;
      newhead.next=prev;
      prev=newhead;
      newhead=front;
   }

   newhead = prev;
   int maxsum=0;

   while( head!=null && newhead!=null)
   { 
      int sum= head.val+newhead.val;
      head=head.next;
      newhead=newhead.next;
      maxsum= Math.max(sum , maxsum);
   }

      return maxsum;
        
    }
}