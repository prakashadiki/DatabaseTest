package part1;

public class Demo extends Object {
    /*public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s3 == s4);
    }*/

    public static void main(String[] args) {
        int[] i = {1};
        i[0] = 2;
        for (int x : i ) {
            System.out.println(x);
        }
    }
}
