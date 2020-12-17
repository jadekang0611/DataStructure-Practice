package dandyloper;

public class SelectionSort {
    public void runSelectionSort(int[] intArray) {

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            // Initialized the largest element in the array
            int largest = 0;

            // i can be equal to lastUnsortedIndex since I have to compare the element at the lastUnsortedIndex in each traversal
            for  (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
        System.out.println("\n-------Selection Sort--------");
        for (int item : intArray) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
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
