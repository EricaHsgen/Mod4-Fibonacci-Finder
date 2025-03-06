public class Fibonacci {
    // find fibonacci number method
    public static int findFibNum(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibNum(n - 1) + findFibNum(n - 2);
    }
}
