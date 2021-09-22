package part1;

public class PrimeTest {
    public static void primeNo(int n) {
        boolean flag = true;
        if (n == 0 || n == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= n/2; i++){
                if(n%i == 0){
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }

    public static void main(String[] args) {
        primeNo(4);
    }
}
