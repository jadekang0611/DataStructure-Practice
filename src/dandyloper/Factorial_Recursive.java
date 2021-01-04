package dandyloper;

public class Factorial_Recursive {
    public static int runFactorialRecursive(int num){
        if(num == 0) {
            return 1;
        }

        return num * runFactorialRecursive(num-1);
    }
}
