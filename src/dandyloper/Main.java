package dandyloper;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
