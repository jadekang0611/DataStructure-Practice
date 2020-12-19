package dandyloper;

public class InsertionSort {
    public void runInsertionSort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            // traverse from left to right
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                // traverse from right to left
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        System.out.println("\n-------Insertion Sort--------");
        for(int item : intArray){
            System.out.println(item);
        }
        System.out.println("-----------------------------");
    }
}

