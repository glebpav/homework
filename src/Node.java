public class Node {

    private int value;
    private Node next;
    private Node prev;

    public Node() {
        value = 0;
        next = null;
    }

    public Node(int value) {
        this.value = value;
        next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prevNode) {
        this.prev = prevNode;
    }
}
