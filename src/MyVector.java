public class MyVector {
    public java.lang.System System;
    private int size;
    private Integer capacity;
    public int[] vector;


    public MyVector() {
        newCapacityOfVector(10);
        size = returnSize();
    }

    public void newCapacityOfVector(int capacity) {
        this.capacity = capacity;
        vector = new int[capacity];
    }

    public void add(int Idx, int val) {
        if (Idx == returnSize()) {
            addLast(val);
        }
        if (Idx >= returnSize()) {
            newCapacityOfVector(Idx - returnSize());
            addLast(val);
        }
        for (int i = Idx + 1; i < returnSize() - 1; i++) {
            cheakCapacity();
            vector[i] = vector[i + 1];
        }
        vector[Idx] = val;

    }

    public void addLast(int a) {
        vector[vector.length] = a;
    }

    public boolean deleteValue(int val) {
        if(deleteIndex(findObject(val))) return true;
        return false;
    }

    public int findObject(int val) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == val) {
                return i;
            }
            if (i < vector.length){
                return 0;
            }
        }
      return 0;
    }

    public boolean deleteIndex(int Idx) {

        vector[Idx] = vector[Idx + 1];
        for (int i = returnSize() ; i > Idx + 1; i--) {

            vector[i] = vector[i - 1];
            return true;
        }

        return false;

    }

    public void SoutTest() {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public int returnLength() {
        return vector.length;
    }

    public int returnSize() {
        int i = 1;

        int intermediateSize = 0;
        while (true)
            if (i < vector.length) {

                if (vector[i] == 0) {
                    ++i;
                    continue;
                } else {
                    ++i;
                    intermediateSize += 1;
                }
            } else {
                return intermediateSize;

            }


    }

    public void set(int Idx, int val) {
        vector[Idx] = val;
    }
    public  int get (int Idx , int val){
        return vector[Idx] = val;
    }
    public boolean cheakCapacity(){
        if(capacity <= size){
            newCapacityOfVector(capacity * 2);
            return true;
        }
        return false;
    }
}


