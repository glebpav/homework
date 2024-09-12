public class MyList {

    Node head;
    Node tail;
    int size;

    public MyList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int value) {

        if (size == 0) {
            head = new Node(value);
            tail = head;
        } else {
            Node newNode = new Node(value, null, tail);
            tail.setNext(newNode);
            tail = newNode;
        }

        size += 1;
    }

    public void deleteLast() {
        if (size == 0) return;
        tail = tail.getPrev();
        tail.setNext(null);
        size -= 1;
    }

    public void delete(Node node) {

        if (size == 0) return;

        Node prevNode = node.getPrev();
        Node nextNode = node.getNext();

        if (prevNode == null) {
            head = nextNode;
        }
        if (nextNode == null) {
            tail = prevNode;
        }

        if (prevNode != null && nextNode != null) {
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
        }

        size -= 1;
    }

    public int getNodeByIdx(int idx) {
        // todo: write
        return 0;
    }

    public Node deleteByIdx(int idx) {
        // todo: write
        return null;
    }

    public void addByIdx(int idx, Node node) {
        // todo: write
    }


}
