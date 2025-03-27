// Last updated: 3/26/2025, 8:46:49 PM
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

    public ListNode reverse(ListNode head)
    {

         if(head==null)
        {
            return null;
        }

        ListNode current=head;
        ListNode prev=null;
        ListNode front =null;


        while(current!=null)
        {
            front=current.next;
            current.next=prev;
            prev=current;
            current= front;
        }
        head = prev;

        return head;


    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // ListNode x = reverse(l1);
         //ListNode y = reverse(l2);   

         ListNode x1 = l1;
         ListNode y1 =l2;

         ListNode result = new ListNode(0);
         ListNode current=result;

         int a =0;
         int carry=0;
         
         while(x1!=null || y1!=null || carry!=0 )
         { 
            int xval; 
            if (x1 != null) {xval = x1.val;  }
             else {xval = 0;  }

            int yval; 
            if (y1 != null) {yval = y1.val;  } 
            else {yval = 0;  }

              a= xval+yval+carry;
              carry= a /10;
              a=a%10;

              current.next=new ListNode(a);
              current=current.next;
             
            
            
             if(x1!=null){x1=x1.next;}
             if(y1!=null){y1=y1.next;}

            
             //result = result.next;

             
            
              
         }




         return result.next;
       
    }
}