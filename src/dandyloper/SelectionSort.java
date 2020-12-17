package dandyloper;

public class SelectionSort {
    public void runSelectionSort(int[] intArray) {

    }

    // Build the swap method
    public static void swap (int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
