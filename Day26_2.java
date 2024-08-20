public class Day26_2 {
    
    public ListNode reverseKGroup(ListNode head, int k) {
        // Dummy node to simplify the head manipulation
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode groupPrev = dummy;
        
        while (true) {
            // Get the kth node from the current groupPrev
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break;
            }
            
            ListNode groupNext = kth.next;
            
            // Reverse the group
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;
            
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            // Adjust the pointers for the next group
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
