public class Node {
    // Fields to store the data and the reference to the next node
    private int Data;
    private Node next;

    // Constructor to create a new Node
    public Node(int _data, Node _next) {
        Data = _data;
        next = _next;
    }

    // Get the next node in the list
    public Node getNext() {

        return next;
    }

    // Return the data of the current node
    public int getData() {

        return Data;
    }

    // Set new data in the current node
    public void setData(int _data) {

        Data = _data;
    }

    // Set the next pointer to a new node
    public void setNext(Node _next) {
        next = _next;
    }
}