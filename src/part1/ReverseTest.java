package part1;

public class ReverseTest {
    public static int reverse(int n) {
        int reverseNo = 0;

        while (n > 0) {
            reverseNo = (reverseNo * 10) + (n % 10);
            n = n / 10;
        }
        return reverseNo;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }
}
