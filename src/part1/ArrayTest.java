package part1;

import java.util.TreeSet;

public class ArrayTest {

    public static int arrayTest() {

        int[] i = {-1,0,90,8,-22};

        TreeSet<Integer> integers = new TreeSet<Integer>();

        for (int n : i ) {
            integers.add(n);
        }

        System.out.println(integers);

        return (int)integers.toArray()[1];
    }


    public static int arrayTest2() {
        int[] n = {-1,0,90,8,-22};

        int a;

        for (int i = 0; i < n.length-1; i++) {

            for (int j = i+1; j < n.length; j++){

                if (n[i] > n[j]) {
                   /* a = n[i];
                    n[i] = n[j];
                    n[j] = a;*/


                    n[i] = n[i] + n[j];    //i=5; j =6     i=5+6
                    n[j] = n[i] - n[j];                //     j = 11-6      5
                    n[i] = n[i] - n[j];                //     i = 11-5    6

                }

            }

        }

        for (int i : n ) {
            System.out.println(i);
        }
        return n[1];
    }

    public static void main(String[] args) {
        System.out.println(arrayTest2());
    }

}
