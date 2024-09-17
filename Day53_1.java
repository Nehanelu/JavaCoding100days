public class Day53_1 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;  
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;   
            
            if (slow == fast) {      
                ListNode start = head;
                while (start != slow) {
                    start = start.next; 
                    slow = slow.next;
                }
                return start;  
            }
        }
        return null;
    }
}

