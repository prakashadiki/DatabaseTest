package part2;

public class Test {


    public static void main(String[] args) {

        String str = "abc-xyz-123";

        String[] split = str.split("-");

        for (String s : split ) {
            System.out.println(s);
        }

        String replace = str.replace("-", " ");

        System.out.println(replace);


        String name = "PRAKASH";

        String substring = name.substring(name.length() - 3);

        System.out.println(substring);
    }
}
