package dandyloper;

public class MergeSort {
    public void runMergeSort(int[] intArray, int start, int end) {

        // this is a recursive method so I need to know when to break
        // if there is only one element in the array there is nothing to be done since the array
        // with one element is already sorted.
        if (end - start < 2) {
            return;
        }

        // partitioning - splitting phase
        // in this case I'm throwing an extra element to the right partition.
        int mid = (start + end) / 2;
        // This first recursion is for the left partition
        runMergeSort(intArray, start, mid);
        // This second recursion is for the right partition
        runMergeSort(intArray, mid, end);
        // Now merge all the partitioned arrays
        merge(intArray, start, mid, end);

        System.out.println("\n---------Merge Sort---------");
        for(int item : intArray) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");

    }

    public static void merge (int[] input, int start, int mid, int end) {

        if (input[mid-1] <= input[mid]) {
            return;
            // because they are already sorted
            // It's my optimization because the result of the merge is going to equal to what I already have in the
            // original input
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // handling the remaining elements in the right partition, while all the left partition has all been copied.
        // Optimization
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        // This is only handling the leftover (already sorted merged array) instead of unnecessarily copying the whole
        // array to the temp. I just move the specific element(s) to the specific location in the original input array.
        // mid - i tells me how many elements I didn't copy over to the temp array yet from the left partition.
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
