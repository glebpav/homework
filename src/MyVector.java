public class MyVector {

    private int size;
    private int capacity;
    public int[] vector;

    public MyVector() {
        newCapacityOfVector(10);
        size = 0;
    }

    public void newCapacityOfVector(int capacity) {
        if (capacity == this.capacity) return;
        this.capacity = capacity;
        int[] tmpArray = new int[capacity];
        if (vector != null) {
            /*for (int i = 0; i < vector.length; i++) {
                tmpArray[i] = vector[i];
            }*/
            System.arraycopy(vector, 0, tmpArray, 0, size);
        }
        vector = tmpArray;
    }

    public void add(int idx, int val) {
        if (idx > size) return;

        int localCapacity = capacity;
        while (size >= localCapacity)
            localCapacity *= 2;

        newCapacityOfVector(capacity * 2);

        for (int i = size; i > idx; i--) {
            vector[i] = vector[i - 1];
        }
        vector[idx] = val;
        size += 1;

    }

    public void addLast(int a) {
        add(size, a);
    }

    public boolean deleteValue(int val) {
        return deleteIndex(findObject(val));
    }

    public int findObject(int val) {
        for (int i = 0; i < size; i++) {
            if (vector[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteIndex(int idx) {
        if (idx >= size || idx < 0) return false;
        for (int i = idx + 1; i < size; i++) {
            vector[i - 1] = vector[i];
        }
        size -= 1;
        return true;
    }

    public void soutTest() {
        /*for (int j : vector) {
            System.out.println(j);
        }*/
        System.out.print("array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(vector[i] + " ");
        }
    }

    public int returnLength() {
        return vector.length;
    }

    public int getSize() {
        return size;
    }

    public void set(int idx, int val) {
        if (idx >= size || idx < 0) return;
        vector[idx] = val;
    }

    public int get(int idx) {
        if (idx >= size || idx < 0) return 0;
        return vector[idx];
    }

}


