class Node {
    Node next = null; // Reference to the next node in the linked list
    int data;         // Data stored in the node

    // Constructor to initialize the node with a data value
    public Node(int d) {
        data = d;
    }

    // Method to append a node to the tail of the linked list
    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next; // Traverse to the end of the list
        }
        n.next = end; // Add the new node at the end
    }

    // Method to print the linked list
    void printList() {
        Node n = this;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        // Create the head of the linked list
        Node head = new Node(1);
        
        // Append additional nodes
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        // Print the linked list
        System.out.println("Linked List:");
        head.printList();
    }
}
