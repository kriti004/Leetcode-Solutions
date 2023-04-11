/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
          ListNode temp = head;
       
        ListNode tem = head;
          while(tem != null && tem.next != null){
            temp=temp.next;
            tem=tem.next.next;
            if(tem==temp){
                return true;
            }
        }
        return false;
        
    }
}