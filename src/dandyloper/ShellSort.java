package dandyloper;

public class ShellSort {
    public void runShellSort (int[] intArray){
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j <= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }

                intArray[j] = newElement;

            }

        }
        System.out.println("\n-------Shell Sort--------");
        for(int item : intArray){
            System.out.println(item);
        }
        System.out.println("-----------------------------");
    }
}
