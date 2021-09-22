package part1;

public class FibonacciTest {

    public static void fibonacciTest(int firstNo, int secondNo, int no) {
        for (int i = 0; i < no; i++) {
            System.out.print(firstNo + "  ");
            int next = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = next;
        }
    }

    public static void main(String[] args) {
        fibonacciTest(2, 4, 10);
    }
}
