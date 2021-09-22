package part1;

public class FactorialTest {
    public static int factorialTest(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorialTest(6));
    }
}
