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
//leetcode problem:  https://leetcode.com/problems/swap-nodes-in-pairs/
class Q11 {
    public ListNode swapPairs(ListNode head) {
        ListNode current=head; 
        ListNode prev,prevN,nextN;
        int n=0,i=1;
        while(current.next!=null)
        {
            n++;
            current=current.next;
        }
        if(n==0 || n==1)
            return head;
        else if(n==2 || n==3)
            return head;
        else
        {
            prev=head;
            current=prev.next;
            nextN=current.next;
            prevN=null;
            while(nextN.next!=null || current.next!=null)
            {
                if(i==1)
                {
                    head=current;
                    current.next=prev;
                    prev.next=nextN;
                    prevN=prev;
                    prev=nextN;
                    current=prev.next;
                    nextN=current.next;
                    i++;
                }
                else
                {
                    prevN.next=current;
                    current.next=prev;
                    prev.next=nextN;
                    prevN=prev;
                    prev=nextN;
                    current=nextN.next;
                    nextN=current.next;
                    i++;
                }
            }
            if(nextN==null)
            {
                prevN.next=current;
                current.next=prev;
                prev.next=null;
            }
            else
            {
                prevN.next=current;
                current.next=prev;
                prev.next=nextN;
            }
            //return head;
        }
        return head;
    }
}