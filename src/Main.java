public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }

        list.deleteLast();
        list.deleteLast();
        list.deleteLast();

        Node node = list.head;
        while (node != null) {
            System.out.println("node value: " + node.getValue());
            node = node.getNext();
        }

    }
}