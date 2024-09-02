public class Main {
   static MyVector myVector;
    public static void main(String[] args) {
        myVector = new MyVector();
        myVector.vector[0] = 20;
        myVector.vector[1] = 11;
        myVector.vector[2] = 34;
        myVector.vector[3] = 218;
        myVector.vector[4] = 976;
        myVector.vector[5] = 10;
        myVector.vector[6] = 372;
        myVector.vector[7] = 3;
        myVector.vector[8] = 3;
        myVector.vector[9] = 20;


        myVector.add(8,5);

        myVector.soutTest();

    }
}