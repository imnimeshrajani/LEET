/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode temp = headA;
        while(temp.next!=null){
            temp = temp.next;
            sizeA++;
        }
        temp = headB;
        while(temp.next!=null){
            temp = temp.next;
            sizeB++;
        }
        int diff = Math.abs(sizeA - sizeB);
        if(sizeA > sizeB)
            while(diff--!=0) 
                headA = headA.next;
        else 
            while(diff--!=0) 
                headB = headB.next;

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}