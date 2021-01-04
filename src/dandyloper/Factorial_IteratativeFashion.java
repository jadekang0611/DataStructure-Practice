package dandyloper;

public class Factorial_IteratativeFashion {
    public void runFactorialIterative(int num){

        if (num == 0) {
            System.out.println(1);
        }
        int multiplier = 1;
        int factorial = 1;

        while(multiplier <= num) {
            factorial *= multiplier;
            multiplier += 1;
        }
        System.out.println(factorial);
    }
}
