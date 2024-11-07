public class SingleLinkedList {
    private Node head = null; // First node of the list
    private Node tail = null; // Last node of the list
    private int size = 0; // the number of nodes in the list

    // Node class to store data and reference to the next node
    private class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    // Append the new node to the end of the linked list
    public void addNode(int data, boolean flag) {
        Node newNode = new Node(data, null);
        if (head == null) { // Add the first node as head, if there is no head
            head = newNode;
            tail = head;
        } else if (flag) { // Add node at head
            newNode.setNext(head);
            head = newNode;
        } else { // Add node at tail
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public int getData(int index) {
        if (index < 1 || index > size) {
            return 0; // Invalid index
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // Print the element at a specific index
    public void printElementAtIndex(int index) {
        if (index < 1 || index > size) {
            System.out.println("Invalid index.");
        } else {
            System.out.println("Element at index " + index + ": " + getData(index));
        }
    }

    public void printMe() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void delete(boolean flag) {
        if (head == null) {
            System.out.println("Error: Attempt to remove from an empty list");
            return;
        }

        if (flag) { // Delete from head
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            if (head == null) { // List became empty
                tail = null;
            }
        } else { // Delete from tail
            if (size == 1) { // Only one node in the list
                head = null;
                tail = null;
            } else {
                Node current = head;
                while (current.getNext() != tail) {
                    current = current.getNext();
                }
                current.setNext(null);
                tail = current;
            }
        }
        size--;
    }
}