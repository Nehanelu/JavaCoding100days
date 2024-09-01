public class Day38_2 {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            
            ListNode current = head;
            
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    // Skip the next node since it's a duplicate
                    current.next = current.next.next;
                } else {
                    // Move to the next node
                    current = current.next;
                }
            }
            
            return head;
        }
    }
    