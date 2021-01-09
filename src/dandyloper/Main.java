package dandyloper;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] intArray = new int[7];
//
//        intArray[0] = 20;
//        intArray[1] = 35;
//        intArray[2] = -15;
//        intArray[3] = 7;
//        intArray[4] = 55;
//        intArray[5] = 1;
//        intArray[6] = -22;
//
//        for (int i : intArray) {
//            System.out.println(i);
//        }
        // This is where I run my bubble sort method
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int num = 6;

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.runBubbleSort(intArray);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.runSelectionSort(intArray);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.runInsertionSort(intArray);

        ShellSort shellSort = new ShellSort();
        shellSort.runShellSort(intArray);

        Factorial_IteratativeFashion factorial_iteratativeFashion = new Factorial_IteratativeFashion();
        factorial_iteratativeFashion.runFactorialIterative(num);

        System.out.println(Factorial_Recursive.runFactorialRecursive(num));

        MergeSort mergeSort = new MergeSort();
        mergeSort.runMergeSort(intArray, 0, intArray.length);
    }

}
