public class Day58_1 {
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode groupPrev = dummy;
        
        while (true) {
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break;
            }
            
            ListNode groupNext = kth.next;
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;
            
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        
        return dummy.next;
    }
    
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
