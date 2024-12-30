class LinkedList {
    LinkedList next = null; // Reference to the next node
    int data;               // Data stored in the node

    // Constructor to initialize the node with a value
    public LinkedList(int d) {
        data = d;
    }

    // Method to append a node to the tail of the linked list
    void appendToTail(int d) {
        LinkedList end = new LinkedList(d);
        LinkedList n = this;
        while (n.next != null) {
            n = n.next; // Traverse to the end
        }
        n.next = end; // Add the new node
    }

    // Method to delete a node with the given data
    static LinkedList deleteNode(LinkedList head, int d) {
        LinkedList n = head;

        // If the head node itself holds the data to be deleted
        if (n.data == d) {
            return head.next; // Move the head to the next node
        }

        // Traverse the list to find and remove the node
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next; // Bypass the node to be deleted
                return head;          // Return the head (unchanged)
            }
            n = n.next; // Move to the next node
        }

        // Return the head if the data is not found
        return head;
    }

    // Method to print the linked list
    void printList() {
        LinkedList n = this;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        // Create the head of the linked list
        LinkedList head = new LinkedList(1);

        // Append additional nodes
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        System.out.println("Original Linked List:");
        head.printList();

        // Delete a node with the value 3
        head = deleteNode(head, 3);

        System.out.println("Linked List After Deleting 3:");
        head.printList();

        // Delete the head node (value 1)
        head = deleteNode(head, 1);

        System.out.println("Linked List After Deleting 1:");
        head.printList();

        // Try deleting a non-existent value (value 10)
        head = deleteNode(head, 10);

        System.out.println("Linked List After Attempting to Delete 10:");
        head.printList();
    }
}
