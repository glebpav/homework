public class MyList {

    Node head;
    int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public void addLast(int value) {
        Node node = head;
        Node prev = null;

        while (node != null) {
            prev = node;
            node = node.getNext();
        }

        if (prev != null) {
            prev.setNext(new Node(value));
        } else {
            head = new Node(value);
        }

        size += 1;
    }

    public void deleteLast() {

        if (size == 0) return;

        Node node = head;
        Node prev = null;

        while (node != null && node.getNext() != null) {
            prev = node;
            node = node.getNext();
        }

        if (prev != null) {
            prev.setNext(null);
        } else {
            head = null;
        }

        size -= 1;
    }

    public void add(int value, int idx) {
        // Todo: write method;
    }

    public void remove(int idx) {
        // Todo: write method;
    }

}
