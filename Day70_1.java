public class Day70_1 {
    Node deleteNode(Node head, int key) {
        if (head == null) return null;
        
        Node curr = head, prev = null;
    if (head.data == key) {
            if (head.next == head) return null;
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head; // Update the last node's next to new head
            return head;
        }

        do {
            prev = curr;
            curr = curr.next;
        } while (curr != head && curr.data != key);

        // If the node with key is found, adjust pointers to delete the node
        if (curr.data == key) {
            prev.next = curr.next;
        }

        return head;
    }

    // Function to reverse a circular linked list
    Node reverse(Node head) {
        if (head == null || head.next == head) return head; // Empty or single node

        Node prev = null, curr = head, next = null;

        do {
            next = curr.next;    // Store the next node
            curr.next = prev;    // Reverse the current node's pointer
            prev = curr;         // Move prev to the current node
            curr = next;         // Move curr to the next node
        } while (curr != head);

        // Adjust the last node and head to make the list circular again
        head.next = prev; // Original head's next becomes the new head
        head = prev;      // Update head to the last node (new head)

        return head;
    }
}

