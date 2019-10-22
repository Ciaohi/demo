package Java.ListStructure;

import org.w3c.dom.NodeList;
import java.util.LinkedList;
/**
 * Created by ciaohi on 2019/10/22 22:08
 */
public class LinkedListDemo {
    public NodeList mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return (NodeList) (l1 != null ? l1 : l2);
        }
        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode other = l1.val >= l2.val ? l1 : l2;
        ListNode prevHead = head;
        ListNode prevOther = other;
        while (prevHead != null) {

            ListNode next = prevHead.next;
            if (next != null && next.val > prevOther.val) {
                prevHead.next = prevOther;
                prevOther = next;
            }
            if(prevHead.next==null){
                prevHead.next=prevOther;
                break;
            }
            prevHead=prevHead.next;
        }
        return (NodeList) head;
    }
}

class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}