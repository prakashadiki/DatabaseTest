package part1;

import java.util.*;

public class StringTest {

    public static void occurrence(String str) {
        List<String> stringList = Arrays.asList(str.split(""));

        Set<String> hashSet = new HashSet<>(stringList);

        for (String s : hashSet) {
            System.out.println(s + " ----- " + Collections.frequency(stringList, s));
        }
    }


    public static void main(String[] args) {
        occurrence("CHANDRA SEKHAR");
    }
}
