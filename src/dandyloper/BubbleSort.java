package dandyloper;

public class BubbleSort  {
    public void runBubbleSort (int[] intArray) {

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i=0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int item : intArray) {
            System.out.println(item);
        }
    }
    public static void swap (int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
