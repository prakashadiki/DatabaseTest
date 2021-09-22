package part1;

public class ArmstrongNumberTest {

    public static void armstrongNumberTest(int n) {
        int num = n, temp = n;
        int arm = 0;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (num > 0) {
            arm = (int) (arm + Math.pow(num%10, count));
            num = num / 10;
        }
        if(temp == arm)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }


    public static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(recursiveMethod("JAVA"));
    }
}
